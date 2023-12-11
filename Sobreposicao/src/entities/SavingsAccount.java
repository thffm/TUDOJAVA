package entities;

public  class SavingsAccount  extends  Acount{
    //Acount super classe
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {

        return interestRate;
    }

    public void setInterestRate(Double interestRate) {

        this.interestRate = interestRate;
    }


    public void updateBalance(){

        balance += balance*interestRate;
    }
    @Override//boa pratica de programacao
    public  void withdraw(double amount){
        balance -= amount;
    }
}
