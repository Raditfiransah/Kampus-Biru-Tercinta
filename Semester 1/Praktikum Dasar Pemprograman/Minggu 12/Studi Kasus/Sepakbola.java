import java.util.Scanner;
public class Sepakbola {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Tim: ");
        int jumtim = input1.nextInt();

        String[] tim = new String[jumtim];
        int[][] skor = new int[jumtim][jumtim];

        for (int i = 0; i < tim.length; i++){
            System.out.print("Masukkan nama Tim " + (i + 1) + ": ");
            tim[i] = input2.nextLine();
        }

        for (int i = 0; i < tim.length; i++){
            for (int j = i + 1; j < tim.length; j++){
                System.out.print(tim[i] + " vs " + tim[j]);
                System.out.print(", Skor: ");
                int skorpertandingan = input1.nextInt();

                skor[i][j] += skorpertandingan;
                skor[j][i] -= skorpertandingan;
            }
        }

        System.out.println("\nHasil Skor Sepakbola:");
        for (int i = 0; i < tim.length; i++){
                System.out.print(" " + tim[i]);
        }

        System.out.println();
        
        for (int i = 0; i < tim.length; i++){
            System.out.print(tim[i] + " : ");
            for (int j = 0; j < tim.length; j++){
                System.out.print(skor[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < tim.length; i++){
            int totalSkor = 0;
            for (int j = 0; j < tim.length; j++){
                totalSkor += skor[i][j];
            }
            System.out.println("totalSkor: " + totalSkor);
        }

    }
}