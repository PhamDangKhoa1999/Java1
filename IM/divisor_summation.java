package IM;

import java.util.Scanner;

public class divisor_summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt(); // Number of integers
            int result = 0;
            double m = Math.sqrt(n);
            if (n == 1) break;
            for(int i = 1; i <= m; i++) {

                if (n % i == 0)  {
                    result += i;
                    if (i != n / i && n/i < n) result += (n/i);
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
