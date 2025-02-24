package init_Java.Lab09;

public class SinhVien {
    private int id;
    private String name;
    private double score;

    



    
    public SinhVien(int id, String name, double score) {

        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "SinhVien [id=" + id + ", name=" + name + ", score=" + score + "]";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        while (true) {
            try {
                if (this.score < 10 && this.score > 0) 
                    this.score = score;
                    break;
    
                
            } catch (Exception e) {
                System.out.println("Du lieu diem khong hop le");
            }
        }

    }

    

}
