package init_Java.Lab08;

public class Lab08 {
    public static void main(String[] args) {
        Student st1 = new Student("1","Khoa",19,9);
        System.out.println(st1);
        st1.setGrade();
        System.out.println(st1);

        Person ps = new Person("2", "Khao", 12);
        System.out.println(ps); 
    }
}
