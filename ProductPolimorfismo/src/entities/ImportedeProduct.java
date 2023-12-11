package entities;

public class ImportedeProduct extends  Product{
    private Double customsFee;


    public ImportedeProduct(){

    }

    public ImportedeProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        return  getPrice()+getCustomsFee();
    }

    @Override
    public String priceTag(){
        setPrice(totalPrice());
        return  super.priceTag()+String.format(" (Custom fee: $ %.2f)",customsFee);
    }
}
