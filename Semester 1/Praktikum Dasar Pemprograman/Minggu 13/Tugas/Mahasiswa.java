package Tugas;

import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {// Fungsi main

        int[][] jumlahTugas = new int [5][7];
        System.out.println("Input Jumlah Tugas Mahasiswa");
        inputJumlahTugas(jumlahTugas);

        String[] mahasiswa = {"Jonathan", "Ardhan", "Nino", "Rizki", "Louis"};

        for(int i = 0; i < 7; i++){
            System.out.print("\tTugas " + (i + 1));
        }
        for (int i = 0; i < 5; i++){
            System.out.print("\n" + mahasiswa[i] + "\t");
            for (int j = 0; j < 7; j++){
                System.out.print(jumlahTugas[i][j] + "\t");
            }
        }
        System.out.println();
        totalJumlahTugas(jumlahTugas);
        System.out.println("total dari penjualan adalah: " + totalJumlahTugas(jumlahTugas));

        penjualanTertinggi(jumlahTugas);
        int indeksTertinggi = penjualanTertinggi(jumlahTugas);
        System.out.println("Penjualan tertinggi adalah: " + mahasiswa[indeksTertinggi]);

        rataRataTugas(jumlahTugas, mahasiswa);

    }// Fungsi main

    static void inputJumlahTugas(int[][] jumlahTugas){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 7; j++){
                System.out.println("input Tugas " + (j + 1) + (": "));
                jumlahTugas[i][j] = input.nextInt();
            }
        }
    }

    static int totalJumlahTugas(int[][] jumlahTugas){
        int total = 0;
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 7; j++){
                total += jumlahTugas[i][j];
            }
        }
        return total;
    }

    static int penjualanTertinggi(int[][] jumlahtugas){
        int jumlahTertinggi = 0;
        int index = 0;
        for (int i = 0; i < 5 ; i++){
            int tertinggi = 0;
            for (int j = 0; j < 7 ; j++) {
                tertinggi += jumlahtugas[i][j];
                if (tertinggi > jumlahTertinggi) {
                    jumlahTertinggi = tertinggi;
                    index = i;
                }
            }
        }
        return index;
    }

    static void rataRataTugas(int[][] jumlahTugas, String[] mahasiswa){
        for (int i = 0; i < 5; i++){
            int rataRata = 0;
            int rata = 0;
            for (int j = 0; j < 7; j++){
                rataRata += jumlahTugas[i][j];
            }
            rata = rataRata / 7;
            System.out.println("Rata rata tugas " + mahasiswa[i] + ": " +  rata);
        }
    }
}
