package init_Java;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] ars)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bai 1: Nhap tu ban phim mot ki tu bat ky: ");
        String a = scanner.nextLine();
        System.out.println("Ki tu ban vua nhap tu ban phim la: " + a);

        System.out.println("Bai 2:");
        System.out.println("Nhap chieu dai hinh chu nhat: ");
        int chieuDai = scanner.nextInt();
        System.out.println("Nhap chieu rong hinh chu nhat: ");
        int chieuRong = scanner.nextInt();
        int P = (chieuDai + chieuRong) * 2;
        System.out.println("Chu vi hinh chu nhat la: " + P );
        int S = chieuDai * chieuRong;
        System.out.println("Dien tich hinh chu nhat la: " + S);
        System.out.println("Canh nho nhat cua hinh chu nhat la: " + Math.min(chieuDai, chieuRong));

        System.out.println("Bai 3:");
        System.out.println("Nhap mot canh cua hinh lap phuong: ");
        int x = scanner.nextInt();
        System.out.println("The tich hinh lap phuong la: " + Math.pow(x, 3));
        scanner.close();
    }
}