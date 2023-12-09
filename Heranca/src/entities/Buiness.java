package entities;

public class Buiness  extends Acount{
    private Double loanlimite;

    public Buiness(){
        super();

    }

    public Buiness(Integer number, String holder, Double balance, Double loanlimite) {
        super(number, holder, balance);
        this.loanlimite = loanlimite;
    }

    public Double getLoanlimite() {
        return loanlimite;
    }

    public void setLoanlimite(Double loanlimite) {
        this.loanlimite = loanlimite;
    }
    public void loan(double amount){
        if (amount <= loanlimite);{
            balance += amount-10;
        }
    }
}
