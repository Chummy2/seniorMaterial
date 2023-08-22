# Foyer Slideshow GUI - User's Manual

If you'd like to view the tutorial for how to build this program, please [click here](https://github.com/Bandera2014/FoyerSlideshow/blob/main/README_2.md).

## Prerequisites

Before attemping to run the program, please make sure you have the latest version of Java installed from the [oracle website](https://www.oracle.com/java/technologies/downloads/#jdk17-windows). Scroll down and click "Windows", then click the link next to "x64 installer".

![image](https://user-images.githubusercontent.com/71509834/158451058-d54060f3-49eb-40da-94db-0598849ca8f6.png)

Once downloaded, double click the downloaded file and go through the installer with the default settings.

<!-- You will also need to download the latest version of PowerShell from [the PowerShell Github](https://github.com/PowerShell/PowerShell). You will want the "x64" version for windows. Be sure to select the ".msi" option from under the "Downloads(Stable)" column.
![image](https://user-images.githubusercontent.com/71509834/158450514-060f0443-8830-4bbb-a0ad-d62c18e7c4de.png)

Once downloaded, double click the downloaded file and go through the installer with the default settings. It may give a warning that "executable files may cause viruses" because it is a msi file, but this file comes directly from Microsoft and won't harm your computer. -->

Before running the program, you will need to make sure that the SSH key on your machine matches the SSH key on the RPi. The following instructions are set up for the SICTC Foyer welcome screens. For other scenarios, the following powershell code may need to be edited.

To start, open a powershell window as an administrator and run the following command:

```ps1
Install-Module -Name Posh-SSH
```

Now you will need to close the administrator powershell and open a normal one. This is so that your powershell is set to the current user and not system32.

Then, you can copy and paste the following code into powershell (Using Ctrl+V or Ctrl+Shift+V to paste). Yes all of it.
**Please read the information below the code block before running the commands in powershell.**

```ps1
$Password = "sictcfoyer"
$User = "pi"
$Command = "mkdir -p .ssh"
$secpasswd = ConvertTo-SecureString $Password -AsPlainText -Force
$Credentials = New-Object System.Management.Automation.PSCredential($User, $secpasswd)
$SessionID = New-SSHSession -ComputerName 10.60.1.9 -Credential $Credentials 
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command 
try{cd ~/.ssh}catch{mkdir .ssh;cd ~/.ssh}
ssh-keygen -t rsa
scp id_rsa.pub pi@10.60.1.9:/home/pi/.ssh
Start-Sleep 3
$Command = "cd .ssh;cat id_rsa.pub >> authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command 
$Command = "cd .ssh;chmod 700 authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command

$SessionID = New-SSHSession -ComputerName 10.60.1.10 -Credential $Credentials 
$Command = "mkdir -p .ssh"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command 
scp id_rsa.pub pi@10.60.1.10:/home/pi/.ssh
Start-Sleep 3
$Command = "cd .ssh;cat id_rsa.pub >> authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command 
$Command = "cd .ssh;chmod 700 authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command

$SessionID = New-SSHSession -ComputerName 10.60.1.27 -Credential $Credentials 
$Command = "mkdir -p .ssh"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command 
scp id_rsa.pub pi@10.60.1.27:/home/pi/.ssh
Start-Sleep 3
$Command = "cd .ssh;cat id_rsa.pub >> authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command 
$Command = "cd .ssh;chmod 700 authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command
```

Powershell will ask you a variety of prompts when you run this code. Below is a table of how to respond to each of the promtps.

| Prompt | Response | Times Prompted |
| --- | --- | --- |
| ![image](https://user-images.githubusercontent.com/71509834/161325515-f53e9cec-0d9b-40a6-b936-7454134d62c3.png) | "Y" | 3 |
| ![image](https://user-images.githubusercontent.com/71509834/161325612-26d7355a-c2a1-430e-b5b1-fc8ccae3e5c1.png) | None (Press Enter) | 1 |
| ![image](https://user-images.githubusercontent.com/71509834/161325696-0834ea6e-6492-4f99-9aeb-8c5d715bb0e9.png) | None (Press Enter) | 1 |
| ![image](https://user-images.githubusercontent.com/71509834/161325753-70933e69-a921-4d64-a9e7-6c07f8789909.png) | None (Press ENter) | 1 |
| ![image](https://user-images.githubusercontent.com/71509834/161325828-a201a065-5b5d-4d43-bd88-b7960d672aeb.png) | "yes" | 3 |
| ![image](https://user-images.githubusercontent.com/71509834/161325901-e04b87c3-16c2-44b7-83e6-4c022809adf0.png) | "sictcfoyer" | 3 |

**Note:** for some of the prompts, it'll look like you aren't typing. It is fine, just type the word "yes" and hit enter.

## Opening the program

Before we begin, it is important to note that each Raspberry Pi is hard-coded into the program, meaning that you do not need to know which one has which IP. All images on each Pi are also the same, so in the program it acts as though you are only controlling one Pi, when you are controlling all three.

The GUI is ran by an executable jar file located in the "workingVersion" folder. It is named "FoyerGUI.jar".

![image](https://user-images.githubusercontent.com/71509834/157729782-8dca0bb8-dec7-48af-b4b6-e0860b382f63.png)

You can drag and drop this file anywhere on your PC.
Simply double click the file and the GUI will open. It should look something like this:

![image](https://user-images.githubusercontent.com/71509834/157731470-ae3d926a-3039-4404-8fa9-1daddc5a9416.png)

## User Interface

In the top left there are two buttons, "Preview" and "Choose Image". Above which is a message that shows which IPs are hard-coded in.

To the right is an image preview box, and in the bottom left is a log box where the program tells you exactly what it is doing.

More buttons will appear under the image preview box which will be explained in the next sections.

## Adding Images

To add an image to the Pi from your computer, click the "Choose Image" button. A file locator prompt will pop up. Locate your image, click it, and hit "Open" in the bottom right.

![image](https://user-images.githubusercontent.com/71509834/157737086-a3bae711-279f-4fe8-b315-59c617e9f104.png)

You image will now appear in the image preview box. Click the the "ADD IMAGE" button that appears below the preview box to add, or click the "CANCEL" button to cancel.

## Viewing and Deleting Images

To see all of the images on the connected Pis, click the "Preview" button.

What should happen is an image will appear in the preview box. Two arrow buttons, a finish, and a delete button should appear below the preview box. An image counter should also appear above your preview box to show which image you're on.

![image](https://user-images.githubusercontent.com/71509834/157741399-eb04da33-db2f-4967-9ee7-00d3f3c96777.png)

The program downloads all of the images from one Pi into a folder called "temp" located wherever the jar file is. This folder will be deleted when the "Finish" button is clicked.

Use the left and right arrows to navigate the images. When you wish to delete an image from the Pi, hit the delete button. The program will ask if you are sure that you want to delete it (no takesies backsies).

![image](https://user-images.githubusercontent.com/71509834/157741812-b335896d-bfce-43dc-b330-d976b0511185.png)

**Once you are finished, it is advised that you click the "Finish" button BEFORE exiting the program.**

**Failure** to do so could create an error the next time you preview the images. If you happen to make this mistake, simply go to where the program is located and delete the "temp" folder.

**Tip:** If you happen to need all of the images from the Pi on your computer, open the program and click the preview button, then click the ![image](https://user-images.githubusercontent.com/71509834/157742945-eb0a1ecd-4ac2-4de6-8941-46ff42b0e033.png)
 in the upper right corner (I know I said not to but in this situation it is okay). Go to where the jar file is located and you should noticed a "temp" folder. Rename this folder to a different name and now you have a folder of all of the images from the Pi.
