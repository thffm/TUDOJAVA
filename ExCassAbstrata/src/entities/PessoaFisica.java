package entities;

public class PessoaFisica  extends  Pessoa{

    private Double costhealf = 0.0;


    public PessoaFisica(){

    }
    public PessoaFisica(String name, Double annualIncome,Double costhealf) {
        super(name, annualIncome);
        this.costhealf = costhealf;
    }

    public Double getCosthealf() {
        return costhealf;
    }

    public void setCosthealf(Double costhealf) {
        this.costhealf = costhealf;
    }

    @Override
    public double tax() {
        if (getAnnualIncome() < 20000.00) {
            if (costhealf != 0) {
                return (getAnnualIncome() * 0.15) - (costhealf * 0.50);
            }
            return getAnnualIncome() * 0.15;

        }


        if (costhealf != 0){
            return (getAnnualIncome()*0.25)-(costhealf*0.50);
        }
        return getAnnualIncome()*0.25;
    }


}
