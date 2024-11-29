package Jobsheet;
import java.util.Scanner;
public class Siakad22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("jumlah mahasiswa: " );
        int jummaha = input.nextInt();
        System.out.print("Jumlah mata kuliah: " );
        int jummatkul = input.nextInt();

        int[][] nilai = new int [jummaha][jummatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa " + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + " : ");
                nilai[i][j] = input.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata rata: " + totalPerSiswa / jummatkul);
        }
        System.out.println("\n==============================");
        System.out.println("Rata rata setiap nilai mata kuliah: ");

        for (int i = 0; i < jummaha; i++) {
            double totalPerMataKuliah = 0;

            for (int j = 0; j < jummatkul; j++) {
                totalPerMataKuliah += nilai[i][j];
            }
            System.out.println("Nilai rata rata mata kuliah " + (i + 1) + ": " + totalPerMataKuliah / jummaha);
        }   
    }
    
}
