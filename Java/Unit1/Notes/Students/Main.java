import java.util.ArrayList;
public class Main{

    public static void main(String[] args){

        ArrayList<Student> classroom = new ArrayList<Student>();

        classroom.add(new Student("ty", 9));
        classroom.add(new Student("zander", 0));
        classroom.add(new Student("brucken", 10));
        classroom.add(new Student("ben", 7));
        classroom.add(new Student("Pohl", 5));
        classroom.add(new Student("steckler", 107));
        classroom.add(new Student("owen", 50));
        classroom.add(new Student("sam", 1));
        classroom.add(new Student("landon", 82));

        printClass(classroom);

        System.out.printf("Lowest Students:  %s\n",minimumGrade(classroom));

        System.out.printf("Highest Students:  %s\n",maximumGrade(classroom));

        System.out.println(avePerct(classroom));

        //System.out.println(aveLetter(classroom));
        

        System.out.println(classroom.size());
}
    public static void printClass(ArrayList<Student> c){
                for(int i=0;i<c.size();i++){
                    System.out.println(c.get(i));
                }
        }
    public static String minimumGrade(ArrayList<Student> c){
                int minGrade = Integer.MAX_VALUE;
                String minName = "";
                for (int i=0; i < c.size();i++){
                    String curName = c.get(i).getName();
                    int curGrade = c.get(i).getGrade();
                    if(curGrade<minGrade){
                        minGrade = curGrade;
                        minName = curName;
                    }
                }
                return minName;
        }
    public static String maximumGrade(ArrayList<Student> c){
                int maxGrade = Integer.MIN_VALUE;
                String maxName = "";
                for (int i=0; i < c.size();i++){
                    String curName = c.get(i).getName();
                    int curGrade = c.get(i).getGrade();
                    if(curGrade>maxGrade){
                        maxGrade = curGrade;
                        maxName = curName;
                    }
                }
                return maxName;
        }
    public static void printTitleCase(ArrayList<Student> c){
        for(int i=0;i<c.size();i++){
            String name = c.get(i).getName();
            name = name.substring(0,1).toUpperCase()+ name.substring(1);
        }
    }
    public static double stdev(ArrayList<Student> c){
        double mean = Double.valueOf(avePerct(c));
        double totalDev = 0;
        for(int i=0;i<c.size();i++){
            totalDev = Math.pow(c.get(i).getGrade()-mean,2);
        }
        return Math.sqrt(totalDev/c.size());
    }
    public static void duplicate(ArrayList<Student> c){
        ArrayList<String> name = new ArrayList<String>();
        for (int i=0;i!=c.size();i++){
            name.add(c.get(i).getName()){
                if (name.contains(c.get(i).getName())){
                    System.out.println(c.get(i).getName());
                    c.remove(i);
                }
            }
    }
    }
    public static void mode(ArrayList<Student>temp ){
            //finding the most frequent number
          //find the unique values....
          ArrayList<Integer> uniqueList = new ArrayList<Integer>();
          uniqueList=duplicate(temp);

          //create a list of 0's that will count the amount of items in unique list
          ArrayList<Integer> countList = new ArrayList<Integer>();
          // countList=createArrayList(new int[uniqueList.size()]);
          //for each for loop
          for(int n: uniqueList){            //for(item in uniqueList)
               countList.add(0);
          }

          //iterate through the uniqueList and count the frequency...
          for(int n:uniqueList){
               int c = count(temp,n);
               countList.set(uniqueList.indexOf(n),c);
          }

          //find the max value in the countList
          int modeValue = maxIntAL(countList);

          //set mode to the index of uniqueList[countList]
          int mode = uniqueList.get(countList.get(modeValue));

          return mode;
    }
    public static int avePerct(ArrayList<Student> c){
            int avg = 0;
            for(int i=0;i<c.size();i++){
                avg +=c.get(i).getGrade();
            }
            avg=avg/c.size();
            return avg;
    }
    //public static int aveLetter(ArrayList<Student> c){
                //int avg = 0;
            //for(int i=0;i<c.size();i++){
                //avg += c.get(i).getGrade();

           // }
            //avg = avg/c.size();
            
            //return avg
        //}
    }