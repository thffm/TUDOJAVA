package entities;

public class PessoaJuridica  extends  Pessoa{
    private Integer employee;

    public PessoaJuridica(){

    }

    public PessoaJuridica(String name, Double annualIncome, Integer employee) {
        super(name, annualIncome);
        this.employee = employee;
    }

    public Integer getEmployee() {
        return employee;
    }

    public void setEmployee(Integer employee) {
        this.employee = employee;
    }

    @Override
    public double tax() {
        if (employee > 10){
            return getAnnualIncome()*0.14;
        }
        return getAnnualIncome()*0.16;
    }
}
