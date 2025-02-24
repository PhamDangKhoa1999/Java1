package init_Java.Lab07;

public class SinhVienCoKhi extends SinhVien{
    //private String skill;
    // public SinhVienCoKhi(int id, String name, double price, double tax, String skill) {
    //     super(id, name, price, tax);
    //     this.skill = skill;
    // }
    //------------------------------------------------------------------------------------

    private double scorePLC;
    private double scoreCNC;

    @Override
    double getScore() {
        return this.scoreCNC + this.scorePLC;
    }

    public double getScorePLC() {
        return scorePLC;
    }

    public void setScorePLC(double scorePLC) {
        this.scorePLC = scorePLC;
    }

    public double getScoreCNC() {
        return scoreCNC;
    }

    public void setScoreCNC(double scoreCNC) {
        this.scoreCNC = scoreCNC;
    }

    public SinhVienCoKhi(double scorePLC, double scoreCNC) {
        super();
        this.scorePLC = scorePLC;
        this.scoreCNC = scoreCNC;
    }

    

}
