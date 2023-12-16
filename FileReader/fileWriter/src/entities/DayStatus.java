package entities;

public class DayStatus {
    public  String name;


    public DayStatus(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Status of day: "+name;
    }
}
