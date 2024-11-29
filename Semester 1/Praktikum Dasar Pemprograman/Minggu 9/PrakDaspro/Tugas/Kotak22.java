package Tugas;

import java.util.Scanner;

public class Kotak22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        for (int h = 1; h <= n; h++) {
            
            for (int i = 1; i <= n; i++) {
                
                if (h == 1 || h == n || i == 1 || i == n) {
                    System.out.print(n);
                }else {
                    System.out.print(" ");
                    
                }
                
            }
            System.out.println();
        }
    }
}
