package Jobsheet;

import java.util.Scanner;

public class HitungTotalHarga {
    public static int hitungTotal(int pilihanMenu, int banyakItem, String diskon){
        int [] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int totalHarga = hargaItem[pilihanMenu - 1] * banyakItem;

        if (diskon.equalsIgnoreCase("DISKON50")){
            System.out.println("ANDA MANDAPATKAN DISKON 50%");
            int totalDiskon = totalHarga * 50/100;
            totalHarga -= totalDiskon;
        }else if (diskon.equalsIgnoreCase("DISKON30")){
            System.out.println("ANDA MANDAPATKAN DISKON 30%");
            int totalDiskon = totalHarga * 30/100;
            totalHarga -= totalDiskon;
        }else {
            System.out.println("KODE PROMO INVALID");
        }
        return totalHarga;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        String pesen= "iya";

        System.out.println("Masukkan kode voucher: ");
        String diskon = input.next();

        while (pesen.equalsIgnoreCase("iya")) {
            System.out.println("Masukkan nomor menu yang anda ingin pesan: ");
            int pilihanMenu = input.nextInt();

            System.out.println("Masukkan jumblah yang ingin pesan: ");
            int banyakItem = input.nextInt();

            total += hitungTotal(pilihanMenu, banyakItem, diskon);

            System.out.println("Pesan lagi? (iya/tidak)");
            pesen = input.next();

        }


        System.out.println("Total harga untuk pesanan anda: Rp "+ total);


        input.close();
    }

}
