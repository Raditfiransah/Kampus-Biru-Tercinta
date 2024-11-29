package Jobsheet;
import java.util.Scanner;

public class Triangle22{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan N");
        int n = input.nextInt();
        int i = 0;

        while (i <= n){
            int j = 0;
            while (j < i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}
