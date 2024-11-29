package Praktikum;
import java.util.Scanner;


public class cafe22 {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);

        boolean keanggotaan;
        int jumlahKopi, jumlahTeh, jumlahRoti;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga, nominalBayar;
        double diskon = 10 / 100f;

        System.out.println("Masukkan Keanggotaan: ");
        keanggotaan = input.nextBoolean();

        System.out.println("Masukkan Jumlah Pembelian Kopi: ");
        jumlahKopi = input.nextInt();
        
        System.out.println("Masukkan Jumlah Pembelian Teh: ");
        jumlahTeh = input.nextInt();
        
        System.out.println("Masukkan Jumlah Pembelian Roti: ");
        jumlahRoti = input.nextInt();

        totalHarga = (jumlahKopi * hargaKopi) + (jumlahTeh * hargaTeh) + (hargaRoti + hargaRoti);
        byte totalByte = (byte) totalHarga;

        nominalBayar = totalHarga - (diskon * totalHarga);
        int nominalInt = (int) nominalBayar; 

        System.out.println("Keanggotaan Pelanggan: "+ keanggotaan);
        System.out.println("Item Pembelian: "+ jumlahKopi+ " Kopi "+ jumlahTeh + " Teh " + jumlahRoti + " Roti");
        System.out.println("Nominal Bayar: " + nominalBayar);
        System.out.println("Nominal Int: " + nominalInt);
        System.out.println("Total Byte: " + totalByte);
    }
}
