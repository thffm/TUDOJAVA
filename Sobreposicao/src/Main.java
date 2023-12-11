import entities.Acount;
import entities.Buiness;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Buiness buiness = new Buiness(925,"Thiago",7400.00,20.0);
        Acount acount = new Acount(1001,"thiago",0.0);
        SavingsAccount savingsAccount = new SavingsAccount(1001,"thiago",2000.0,7000.0);

        //upcasting

        Acount acc1 = buiness;
        Acount acc2 = new Buiness(1003,"bob",0.0,2000.0);
        Acount acc3 = savingsAccount;

        //downcasting
        Buiness acc4 = (Buiness) acc2;
        acc4.loan(100.0);

        //acc3 instanceof buiness || acc3 istanceof SavingsAccount
        if(acc3 instanceof Buiness){
            Buiness acc5 = (Buiness) acc3;
            acc5.loan(200.0);
            System.out.println("Loan");

        }
        if (acc3 instanceof  SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update>");
        }
        System.out.println("Account: ");
        acount.withdraw(200.0);
        System.out.println(acount.getBalance());
        System.out.println("Savings: ");
        buiness.withdraw(200.0);
    }

}