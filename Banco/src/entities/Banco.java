package entities;

public class Banco {
    private int NumberAccount;
    public String Name;
    private double Deposit;
    public double withdraw;

    public  Banco(int NumberAccount,String Name){
        this.Name =Name;
        this.NumberAccount = NumberAccount;

    }
    public  Banco(int NumberAccount,String Name, double Deposit){
        this.Name =Name;
        this.NumberAccount = NumberAccount;
        this.Deposit = Deposit;
    }

    public void setAdd(double deposit){
        withdraw += deposit;
        System.out.printf("Update:\n balance: %.2f",withdraw);

    }

    public void setretirar(double value){
        withdraw = withdraw - value-5;
        System.out.printf("Update:\n balance: %.2f\n",withdraw);

    }


    public String toString() {
        return String.format("Nome: %S\n Account: %d\n withdraw: %.2f",Name,NumberAccount,withdraw);
    }
}
