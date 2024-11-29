package Jobsheet;
import java.util.Scanner;

public class Star22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan N");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            
            System.out.print("*");
        }
    }
}
