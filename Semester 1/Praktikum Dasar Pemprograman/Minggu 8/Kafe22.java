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
                hargamenu = 12000;
            case "kopi":
                hargamenu = 7000;
            case "coklat":
                hargamenu = 20000;
                break;
            default:
                System.out.println("Menu yang anda pilih tidak tersedia");
                break;
        }

        double totalHarga = hargamenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga =(totalHarga + 0.25)  * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default: 
                System.out.println("Ukuran cup yang anda pilih tidak tersedia");
                break;
        }
        double diskon = keanggotaan ? 0 : 0.1;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " Ukuran "+ ukuranCup);
        System.out.println("Nominal Bayar: " + nominalBayar);
        
    }
}


