package init_Java.Lab08;

public  class Student extends Person{
    private int mark;
    private String grade;
    public Student(String id, String name, int age, int mark) {
        super(id, name, age);
        this.mark = mark;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    public String getGrade() {
        return grade;
    }

    
    
    public void setGrade() {
        if (this.mark >= 8) this.grade = "A";

        if (this.mark < 8) this.grade = "B";
    }

    @Override
    public String toString() {
        return "Student [mark=" + mark + ", grade=" + grade + "]";
    }
    
    
    
}
