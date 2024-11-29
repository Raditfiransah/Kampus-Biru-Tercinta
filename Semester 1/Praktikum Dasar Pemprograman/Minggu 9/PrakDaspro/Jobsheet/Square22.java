package Jobsheet;
import java.util.Scanner;

public class Square22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        for (int iOuter1 = 1; iOuter1 <= n; iOuter1++) {
            
            for (int i = 0; i <= n; i++) {
                
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
