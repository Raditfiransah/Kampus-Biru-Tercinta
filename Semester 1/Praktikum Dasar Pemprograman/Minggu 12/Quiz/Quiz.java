package Quiz;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        String[] hari = {"Senin", "Selasa", "rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
        System.out.println("Masukkan jumlah wilayah: ");
        int jumWilayah = input.nextInt(); 
        
        int[][] konsumsi = new int [jumWilayah][7];
        String[] wilayah = new String [jumWilayah];

        for (int i = 0; i < jumWilayah; i++){
            System.out.println("Masukkan nama wilayah: ");
            wilayah[i] = input2.nextLine();
        }

        //

        for (int i = 0; i < jumWilayah ; i++){
            for (int j = 0; j < 7 ; j++){
                System.out.print("Konsumsi wilayah " + wilayah[i] + " hari " + hari[j] + ": ");
                konsumsi[i][j] = input.nextInt();
            }
        }

        System.out.println();
        System.out.println("SISTEM PEMANTAUAN KONSUMSI AIR BERSIH ANTAR WILAYAH");
        System.out.println("================================================================");

        //

        for (int i = 0; i < 7; i ++){
            System.out.print("\t"+hari[i]);
        }

        for (int i = 0; i < jumWilayah; i ++){
            System.out.print("\n" + wilayah[i]+ "\t"); 
            for (int j = 0; j < 7 ; j++){
                System.out.print(konsumsi[i][j] + "\t");
            }
        }
        System.out.println();
        System.out.println("================================================================");

        //total konsumsi wilayah

        for (int i = 0; i < jumWilayah; i++) {
            double totalkonsumsi = 0;
            for (int j = 0; j < 7 ; j++){
                totalkonsumsi += konsumsi[i][j];
            }
            System.out.println("Total konsumsi wilayah " + wilayah[i] + " adalah " + totalkonsumsi);
        }

        //rata rata konnsumsi wilayah
        System.out.println();        

        for (int i = 0; i < jumWilayah; i++) {
            double rataRataHarian = 0;
            int rata = 0;
            for (int j = 0; j < 7 ; j++){
                rata += konsumsi[i][j];
            }
            rataRataHarian = rata / 7;
            System.out.println("Rata-rata konsumsi wilayah " + wilayah[i] + " adalah " + rataRataHarian);
        }

        //hari dengan konsumsi tertinggi
        System.out.println();

        int max = 0;
        int index1 = 0;
        for (int i = 0; i < jumWilayah; i++){
            for (int j = 0; j < 7 ; j++){
                if (konsumsi[i][j] > max){
                    max = konsumsi[i][j];
                    index1 = j;
                }
            }
        }
        System.out.println("Hari dengan konsumsi tertinggi adalah hari " + hari[index1]);

        //konsumsi tertinggi
        System.out.println();
 

        System.out.println("Wilayah dengan total konsumsi tertinggi selama satu minggu adalah " + wilayah[index]);
        input.close();

    }
}
