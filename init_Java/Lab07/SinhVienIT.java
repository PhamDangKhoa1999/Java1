package init_Java.Lab07;

public class SinhVienIT extends SinhVien{
    // private String language;
    // public SinhVienIT(int id, String name, double price, double tax, String language) {
    //     super(id, name, price, tax);
    //     this.language = language;
    // }
    //------------------------------------------------------------------------------------------------
    
    private double scoreJava;
    private double scoreHTML;
    
    @Override
    double getScore() {
        return this.scoreHTML + this.scoreJava;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public double getScoreHTML() {
        return scoreHTML;
    }

    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }

    public SinhVienIT(double scoreJava, double scoreHTML) {
        super();
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    
}
