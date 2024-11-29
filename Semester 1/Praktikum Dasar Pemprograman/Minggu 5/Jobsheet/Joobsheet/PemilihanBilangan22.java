package Joobsheet;
import java.util.Scanner;

public class PemilihanBilangan22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka: ");
        angka = input.nextInt();
        
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        
        System.out.println("Angka adalah bilangan " + hasil);
        }
    }
