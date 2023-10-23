public class Student {

    String n = "name";
    int g = 0;


    public Student(String name, int grade){
        this.n=name;
        this.g=grade;

    }
    public String getName(){
        return this.n;
    }
    public int getGrade(){
        return this.g;
    }
    public void resetName(String newName){
        this.n=newName;
    }
    public void setGrade (int newGrade){
        this.g=newGrade;
    }



    @Override
    public String toString() {
        String out="";
        out+=("name:\t"+this.n);
        out+=("\nGrade:\t"+this.g+"\n");
        return out;
    }

}
