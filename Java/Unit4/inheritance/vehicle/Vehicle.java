public class Vehicle {
    private String title,brand,speed,acceleration,braking,material,color,fuel;
    public Vehicle(String title,String color,String fuel,String speed){
        this.title=title;
        this.color=color;
        this.fuel=fuel;
        this.speed=speed;

    }

    public void accelerate(int time){
        this.speed+=acceleration*time;
    }
    public void decelerate (int time){
        this.speed+=braking*time;
    }
    public void destruct(){
        this.speed="STOP";
    }
}