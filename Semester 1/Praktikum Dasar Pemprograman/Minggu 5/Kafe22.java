package Minggu5;
import java.util.Scanner;
public class Kafe22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu;
        int jumlah;
        char ukuranCup;
        boolean keanggotaan;
        
        System.out.println("Menu Cafe: ");
        menu = input.nextLine();
        System.out.println("Ukuran Cup: ");
        ukuranCup = input.next().charAt(0);
        System.out.println("Jumlah: ");
        jumlah = input.nextInt();
        System.out.println("Keanggotaan (y/n): ");
        keanggotaan = input.nextBoolean();

        double hargamenu = 0;

        switch (menu.toLowerCase()) {
            case "teh":
                hargamenu = 4000;
            case "kopi":
                hargamenu = 5000;
            case "coklat":
                hargamenu = 5000;
                break;
            default:
                System.out.println("Menu yang anda pilih tidak tersedia");
                break;
        }

        double totalHarga = hargamenu * jumlah;

        switch (ukuranCup) {
            case 'S':
            case 'M':
                totalHarga =(totalHarga + 0.25)  * totalHarga;
            case 'L':
                totalHarga += 0.4 * totalHarga;
        }
        double diskon = keanggotaan ? 0 : 0.1;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.printf("Total Harga: \n", totalHarga);
        System.out.printf("Nominal Bayar: \n", nominalBayar);

    }
}

