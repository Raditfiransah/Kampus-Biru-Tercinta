import java.util.Scanner;
public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] pertanyaan = new int[10][6];

        for (int i = 0; i < pertanyaan.length; i++) {

            System.out.println("Responden ke-" + (i + 1));
            
            for (int j = 0; j < pertanyaan[i].length; j++) {
                System.out.print("Pertanyaan " + (j + 1)+" (1-5): " );
                pertanyaan[i][j] = input.nextInt();

                if (pertanyaan[i][j] < 1 || pertanyaan[i][j] > 5) {
                    System.out.println("Masukkan nilai antara 1-5.");
                    j--;
                }
            }
            System.out.println();
        }

        //Responden

        double rataResponden = 0;
        for (int i = 0; i < pertanyaan.length; i++){
            int rataRata = 0;
            for (int j = 0; j < pertanyaan[i].length; j++){
                rataRata += pertanyaan[i][j];
            }
            rataResponden = (double) rataRata / pertanyaan[i].length;
            System.out.println("Rata rata responden ke-" +(i + 1)+" adalah: "+ rataResponden);

        }

        //Pertanyaan

        double rataPertanyaan = 0;
        for (int j = 0; j < pertanyaan[0].length; j++){
            int rataRata = 0;
            for (int i = 0; i < pertanyaan.length; i++){
               rataRata += pertanyaan[i][j];
            }
            rataPertanyaan = (double) rataRata / pertanyaan.length;
            System.out.println("Rata rata pertanyaan ke-" +(j + 1)+" adalah: "+ rataPertanyaan);
            
        }

        //Keseluruhan
        
        int rataRata = 0;
        int total = pertanyaan[0].length * pertanyaan.length;
        
        for (int i = 0; i < pertanyaan.length; i++){
            for (int j = 0; j < pertanyaan[i].length; j++){
                rataRata += pertanyaan[i][j];
            }
            
        }
        double rataKeseluruhan = rataRata / total;
        System.out.println("Rata rata keseluruhan adalah: "+ rataKeseluruhan);
    }
}
