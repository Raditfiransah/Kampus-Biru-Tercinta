package Tugas;
import java.util.Scanner;

public class Cafe {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.err.print("Jumlah pesanan: ");
        int jmlPesanan = input1.nextInt();
        
        String [] makanan = new String[jmlPesanan];
        int[] harga = new int[jmlPesanan];

        for (int i = 0; i < makanan.length; i++){
            System.out.print("Nama makanan: ");
            makanan[i] = input2.nextLine();
            System.out.print("Harga makanan: ");
            harga[i] = input1.nextInt();
        }   
        
        int totalHarga = 0;
        for (int i = 0 ; i < makanan.length; i++) {
            totalHarga += harga[i];
        }
        for (int i = 0 ; i < makanan.length; i++){
            System.out.println("Makanan: " + makanan[i] + ", Harga: " + harga[i]);
        }
        System.out.println("Total harga: " + totalHarga);
    }
}
