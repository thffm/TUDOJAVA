package entities;

public class Carro {
    public String Name;
    public int Year;
    private double Price;
    public String Engine;
    public boolean Statuscar;

    public Carro(){

    }

    public Carro(String Name, int Year, String Engine){
        this.Name = Name;
        this.Year = Year;
        this.Engine =Engine;

    }

    public void offON(){
        if (Statuscar){
            System.out.printf("%s esta desligando...\n",Name);
            Statuscar = false;
        }
        else {
            System.out.printf("%s esta ligando...Vrummm\n",Name);
            Statuscar = true;
        }

    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}

