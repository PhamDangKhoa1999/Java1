package init_Java.Lab03;
import java.util.Arrays;
import java.util.Scanner;

public class Lab03 {
     public static void main(String[] args) {
        String[] doiBongToiYeu = new String[3];
        doiBongToiYeu[0] = "Barca";
        doiBongToiYeu[1] = "MU";
        doiBongToiYeu[2] = "MC";
        for (int i = 0; i < doiBongToiYeu.length; i++){
            System.out.println("Doi bong toi yeu " + i + ":" + doiBongToiYeu[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao mot so nguyen bat ky lon hon 2: ");
        int i = scanner.nextInt();
        boolean isPrime = true;
        for( int j = 2; j < i-1 ; j++){
            if (i%j==0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println("So vua nhap la so nguyen to");
        } else {
            System.out.println("So vua nhap khong phai la so nguyen to");
        }

        System.out.printf("Nhap vao mot so nguyen bat ky : ");
        int x = scanner.nextInt();
        System.out.println("Bang cuu chuong cua so vua nhap la: ");
        for(int y = 0; y <=10; y++){
            int result = x*y;
            System.out.printf( "%d * %d = %d",x,y,result );
            System.out.println();
        }

        System.out.printf("Nhap vao so phan tu cua mang : ");
        int size = scanner.nextInt();
        int[] array =  new int[size];

        System.out.println("Nhap vào cac phần tu cua mang: ");
        for (int z = 0; z < size; z++){
            System.out.printf("Phan tu %d: ", z+1);
            array[z] = scanner.nextInt();
        }
        System.out.print("Mang vua nhap la: ");
        // for(int w = 0; w < size; w++){
        //     System.out.print(array[w] + " ");
        // }
        Arrays.sort(array);
        System.out.println("Mang va nhap la: " + Arrays.toString(array));
        System.out.println();
        
        
        int max = array[0];
        for(int u = 0; u < size; u++){
            max = Math.max(max, array[u]);
        }
        System.out.println("Gia tri max cua mang la: " + max);
        
        
        int min = array[0];
        for (int t = 0; t < size; t++){
            min = Math.min(min, array[t]);
        }
        System.out.println("Gia tri min cua mang la: " + min);
        scanner.close();

     }
}
