package entities;

public class OutsourcedEmployee extends Employee {
    private Double temp;


    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double temp) {
        super(name, hours, valuePerHour);
        this.temp = temp;
    }


    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @Override
    public Double payment(){
        //polimorfismo
        return super.payment()+temp*1.1;

    }
}
