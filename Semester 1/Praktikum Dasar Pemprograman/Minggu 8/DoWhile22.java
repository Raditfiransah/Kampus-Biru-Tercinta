import java.util.Scanner;
public class DoWhile22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kopi, teh, roti;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.println("Masukkan nama ketik 'batal' untuk membatalkan : ");
            namaPelanggan = input.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Anda membatalkan pembelian");
                break;
            }

            System.out.println("Jumlah kopi");
            kopi = input.nextInt();

            System.out.println("Jumlah teh");
            teh = input.nextInt();

            System.out.println("Jumlah roti");
            roti = input.nextInt();
            
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Pelanggan dengan nama: " + namaPelanggan);
            System.out.println("Total harga: " + totalHarga);
            input.nextLine();

        } while (true);

        System.out.println("Semua transaksi selesai");
        
    }
}
