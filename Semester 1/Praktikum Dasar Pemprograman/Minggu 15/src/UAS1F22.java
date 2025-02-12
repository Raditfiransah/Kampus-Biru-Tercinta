//Radit Firansah
//244107020196
//

import java.util.Scanner;

public class UAS1F22 {
    static String[][] namaTim22 = new String[4][2];
    static int[][] skor22 = new int[4][2];
    static int totalskor22[][] = new int[4][1];
    public static void main(String[] args) {
        tampilan(); 
    }
    static void tampilan(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Input data skor tim");
        System.out.println("2. Tampilkan tabel skor");
        System.out.println("3. Tentukan juara");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");

        
        int pilihan = input.nextInt();
        System.out.println();
    
        while (true) {
            switch (pilihan) {
                case 1:
                    masukkanskor();
                    break;
                case 2:
                   tampilanTabel();
                    break;
                case 3:
                    pemenang();
                    break;
                case 4:
                    System.out.println("Terimakasih");
                    break;
                default:
                    System.out.println("Pilihan Salah!");
                    continue;
            }
        }
    }

    static void masukkanskor(){ 
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Input Nama Tim " + (i + 1) +": ");
            namaTim22[i][0] = input.next();
            for(int j = 0; j < 2; j++){
                System.out.print("Input skor " + namaTim22[i][0] + " Untuk Level " + (j + 1) + ":");
                skor22[i][j] = input2.nextInt();
                if (skor22[i][j] < 0){
                    System.out.println("Skor tidak valid");
                    continue;
                }
                if (skor22[i][j] < 35){
                    skor22[i][j] = 0;
                }
            }
            totalskor22[i][0] = skor22[i][0] + skor22[i][1];
        }
        tampilan();
    }

    static void tampilanTabel(){
        System.out.println("=================== Daftar Tim ===================");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Tim", "Level 1", "Level 2", "Total skor22");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%-10s %-10s %-10s %-10s\n", namaTim22[i][0], skor22[i][0], skor22[i][1], totalskor22[i][0]);
        }
        System.out.println();
        tampilan();
    }

    static void pemenang(){
        int tertinggi = 0;
        int indeks = -1;
        for (int i = 0; i < 4; i++){
            if(totalskor22[i][0] > tertinggi){
                tertinggi = totalskor22[i][0];
                indeks++;
            }
        }
        System.out.println("Pemenang: " + namaTim22[indeks][0]);
        tampilan();
    }
}