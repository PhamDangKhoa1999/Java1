package init_Java.Lab06;

import java.util.ArrayList;

public class Lab06 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("User Name: ");
        // String userName = scanner.nextLine();
        // System.out.println("Password: ");
        // String password = scanner.nextLine();
        // if (userName.equals("dangkhoa") &&  password.length() > 6) {
        //     System.out.println("Success Login!");
        // }
        // else {
        //     System.out.println("Fail Login!");
        // }
        // scanner.close();
        Student st1 = new Student("N A","1");
        Student st2 = new Student("P A","2");
        Student st3 = new Student("V A","3");
        Student st4 = new Student("A A","4");
        Student st5 = new Student("N B","5");
        Student st6 = new Student("A 4","6");
        Student st7 = new Student("N D","7");
        Student st8 = new Student("@ A","8");
        Student st9 = new Student("4 A","9");

        ArrayList<Student> students = new ArrayList<>();
        students.add(st9);
        students.add(st8);
        students.add(st7);
        students.add(st6);
        students.add(st5);
        students.add(st4);
        students.add(st3);
        students.add(st2);
        students.add(st1);
        
        for (int i = 0; i < students.size() ; i++) {
            if (students.get(i).getName().startsWith("N")) {
                System.out.println("Ten bat dau bang N: " + students.get(i) );
            }
        }
    }
}

