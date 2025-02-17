package init_Java.Lab07;

public class SinhVienIT extends SinhVien{
    private String language;

    public SinhVienIT(int id, String name, double price, double tax, String language) {
        super(id, name, price, tax);
        this.language = language;
    }
    
}
