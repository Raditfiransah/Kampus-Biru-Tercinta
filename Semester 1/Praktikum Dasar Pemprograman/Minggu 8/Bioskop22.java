
import java.util.Scanner;

public class Bioskop22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahTiket, hargaTiket, totalTiket=0,totalHarga=0, diskon;
        boolean lanjut = true;

        while (lanjut) {
            System.err.println("Jumlah tiket yang akan dibeli: ");
            jumlahTiket = input.nextInt();

            if (jumlahTiket <= 0){
                System.out.println("jumlah tidakk valid");
                continue;

            }else {
                hargaTiket = jumlahTiket*50000;

                if (jumlahTiket > 10){
                    diskon = (int) (0.05 * hargaTiket);
                }else if(jumlahTiket > 4){
                    diskon = (int) (0.1 * hargaTiket);
                }else{
                    diskon = 0;
                }
                
                hargaTiket = hargaTiket - diskon;
                totalTiket += jumlahTiket;
                totalHarga += hargaTiket;
                System.out.println("Harga tiket: " + hargaTiket);
                System.out.println("Lanjut membeli");
                lanjut = input.nextBoolean();
            }
            
            
        }
        System.out.println("Total tiket: " + totalTiket);
        System.out.println("Total harga: " + totalHarga);
    }
}
