package init_Java;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int test1 = 10 + 2;
        System.out.println("Result:  " + test1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = scanner.nextLine();
        System.out.println("Your age: ");
        int age = scanner.nextInt();
        System.out.println("Your name: " + name + ", your age: "  + age);

        System.out.println("firtNumber: ");
        int firtNumber = scanner.nextInt();
        System.out.println("secondNumber: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Min = " +  Math.min(firtNumber, secondNumber));
        scanner.close();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhap vao mot 1, 2 hoac 3: ");
        int d =  scanner.nextInt();
        switch (d) {
            case 1:
                System.out.println("Ban vua chon phep cong");
                break;
            case 2:
                System.out.println("Ban vua chon phep tru");
                break;
            case 3:
                System.out.println("Ban lua chon thoat chuong trinh");
                System.exit(0);
                break;
            default:
                break;
        }
        scanner1.close();
    }
}
