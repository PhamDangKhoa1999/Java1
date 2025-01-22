package init_Java.Lab04;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product() {

    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public Double getPrice() {
        return price;
    }
    public void setTax(Double tax){
        this.tax = tax;
    }
    public Double getTax() {
        return tax;
    }

    public Product nhapThongTin(String name, double price, double tax) {
        Product pr = new Product(name, price, tax);
        return pr;
    }
    public void xuatThongTin(Product pr) {
        System.out.println("name " + pr.getName() + " price " + pr.getPrice() + " tax " + pr.getTax());
    }
    public double getTaxPrice(double price, double tax) {
        return tax * price;
    }

}