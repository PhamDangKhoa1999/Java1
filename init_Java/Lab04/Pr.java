package init_Java.Lab04;

public class Pr {
    public static void main(String[] args) {
        Product test = new Product();
        Product pr1 = test.nhapThongTin("A", 200, 0.1);
        test.xuatThongTin(pr1);
        System.out.println("Gia tri TaxPrice: " + pr1.getTaxPrice(pr1.getPrice(), pr1.getTax()) );
    }
}