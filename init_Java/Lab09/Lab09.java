package init_Java.Lab09;

import java.util.Scanner;

public class Lab09 {
    public static int NhapMaSinhVien() {
        System.out.println("Nhap ma sinh vien: ");
        int result;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                result = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Gia tri khong hop le, nhap lai.");
                scanner.next();
            }
        }
        scanner.close();
        return result;
    }
    public static void main(String[] args) {
        int mssv = NhapMaSinhVien();
    }
}
