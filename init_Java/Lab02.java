package init_Java;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Bai 1");
        // System.out.println("Nhap vao gia tri cua a: ");
        // int a = scanner.nextInt();
        // System.out.println("Nhap vao gia tri cua b: ");
        // int b = scanner.nextInt();
        // //ax+b=0
        // switch (a) {
        //     case 0:
        //         switch (b) {
        //             case 0:
        //                 System.out.println("Phuong trinh co vo so nghiem");
        //                 break;
        //             default:
        //                 System.out.println("Phuong trinh vo nghiem");
        //                 break;
        //         }
        //         break;
        
        //     default:
        //         System.out.println("Phuong trinh co nghiem: " + (-b/a));
        //         break;
        // }
        // System.out.println("Bai 2");
        // System.out.println("Nhap vao gia tri cua c: ");
        // int c = scanner.nextInt();
        // System.out.println("Nhap vao gia tri cua d: ");
        // int d = scanner.nextInt();
        // System.out.println("Nhap vao gia tri cua e: ");
        // int e = scanner.nextInt();
        // double detal = Math.pow(d,2) - 4*c*e;
        // if (detal < 0) {
        //     System.out.println("Phuong trinh vo nghiem");
        // } else if (detal == 0 ){
        //     System.out.println("Phuong trinh co nghiem kep x = "  + (-d/(2*c)));
        // } else {
        //     System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + (-d + Math.sqrt(detal)/(2*c)));
        //     System.out.println("Phuong trinh co 2 nghiem phan biet: x2 = " + (-d - Math.sqrt(detal)/(2*c)));
        // }
        System.out.println("Bai 3");
        System.out.println("Nhap vao so dien cua ban: ");
        int f = scanner.nextInt();
        if (f  >= 0 && f <= 100) {
            System.out.println("So tien dien can phai tra la: " + (f*1000));
        } else if (f > 100){
            System.out.println("So tien dien can phai tra la: " + (f*1500));
        } else {
            System.out.println("So dien phai la mot so >= 0. Vui long thuc hien lai chuong trinh.");
        }
        scanner.close();
    }
}