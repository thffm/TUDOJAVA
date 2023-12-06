package entities;

public class Dolar {
    public static double dolarIof(double money){
        double iof = (6.0/100.0);
        return iof*money+money;


    }
    public static double dolarToReal(double dolar_day,double money){
        return  dolar_day*money;
    }
}
