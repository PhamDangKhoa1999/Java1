package init_Java.Lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap vao so nguyen: ");
            int x = scanner.nextInt();
            list.add(x);
            System.out.println("Nhap them (Y/N): ");
            scanner.nextLine();
            String choice = scanner.nextLine();
            if (choice.equals("N")) {
                break;
            } 
        }
        scanner.close(); 
        System.out.println("Mang vua nhap la: " + list.toString());
        // Tính tổng giá trị của ArrayList
        // mapToInt(Integer::intValue): Chuyển đổi các phần tử trong Stream từ Integer sang int, cho phép sử dụng phương thức sum().
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        System.out.println("Tong gia tri cua mang la: " + sum);
  
    }
    
}
