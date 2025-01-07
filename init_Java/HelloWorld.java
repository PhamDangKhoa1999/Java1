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

        int a = 10;
        int b = 6;
        int c = Math.max(a, b);
        System.out.println("firtNumber: ");
        int firtNumber = scanner.nextInt();
        System.out.println("secondNumber: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Min = " +  Math.min(firtNumber, secondNumber));
        scanner.close();
    }
}
