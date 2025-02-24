package IM;

import java.util.Scanner;

public class prime_generator {
    // Hãy tìm các số nguyên tố nằm trong khoảng từ n đến m với 1<=m<=n<=1000000000 và n-m<=1000000
    // Đầu vào:
    // Số lượng test case, mỗi test case chứa 2 số nguyên là m và n.
    // Đầu ra:
    // Liệt kê các số nguyên tố từ m đến n.
    
    // Input:
    // 2
    // 1 10
    // 3 5

    // Output:
    // 2
    // 3
    // 5
    // 7

    // 3
    // 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            for( int j = m; j <=n ; j++) {
                if (isPrime(m)) {
                    System.out.println(j);
                }
            }
        scanner.close();
        }
    }

    public static boolean isPrime(int num) {
        if(num < 2) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
