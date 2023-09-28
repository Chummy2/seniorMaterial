$Password = "raspberry"
$User = "pi"
$Command = "mkdir -p .ssh"
$secpasswd = ConvertTo-SecureString $Password -AsPlainText -Force
$Credentials = New-Object System.Management.Automation.PSCredential($User, $secpasswd)
$SessionID = New-SSHSession -ComputerName 192.168.68.62 -Credential $Credentials 
Invoke-SSHCommand -Index $SessionID.sessionid -Command $Command 
try{cd ~/.ssh}catch{mkdir .ssh;cd ~/.ssh}
ssh-keygen -t rsa
scp id_rsa.pub pi@192.168.68.62:/home/pi/.ssh
Start-Sleep 3
$Command = "cd .ssh;cat id_rsa.pub >> authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command 
$Command = "cd .ssh;chmod 700 authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command



$Password = "raspberry"
$User = "pi"
$Command = "mkdir -p .ssh"
$secpasswd = ConvertTo-SecureString $Password -AsPlainText -Force
$Credentials = New-Object System.Management.Automation.PSCredential($User, $secpasswd)
$SessionID = New-SSHSession -ComputerName 192.168.68.57 -Credential $Credentials 
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command 
try{cd ~/.ssh}catch{mkdir .ssh;cd ~/.ssh}
ssh-keygen -t rsa
scp id_rsa.pub pi@192.168.68.57:/home/pi/.ssh
Start-Sleep 3
$Command = "cd .ssh;cat id_rsa.pub >> authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command 
$Command = "cd .ssh;chmod 700 authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command

$SessionID = New-SSHSession -ComputerName 192.168.68.57 -Credential $Credentials 
$Command = "mkdir -p .ssh"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command 
scp id_rsa.pub pi@192.168.68.57:/home/pi/.ssh
Start-Sleep 3
$Command = "cd .ssh;cat id_rsa.pub >> authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command 
$Command = "cd .ssh;chmod 700 authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command

$SessionID = New-SSHSession -ComputerName 192.168.68.57 -Credential $Credentials 
$Command = "mkdir -p .ssh"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command 
scp id_rsa.pub pi@192.168.68.57:/home/pi/.ssh
Start-Sleep 3
$Command = "cd .ssh;cat id_rsa.pub >> authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command 
$Command = "cd .ssh;chmod 700 authorized_keys"
Invoke-SSHCommand -Index $sessionid.sessionid -Command $Command