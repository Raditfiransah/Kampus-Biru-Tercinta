package Tugas;

import java.util.Scanner;

public class PenjualanCafe {
    public static void main(String[] args) {// Fungsi main

    int[][] penjualan = new int [5][7];
        System.out.println("input Penjualan");
    inputPenjualan(penjualan);

    String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    for(int i = 0; i < 7; i++){
        System.out.print("\tHari " + (i + 1));
    }
    for (int i = 0; i < 5; i++){
        System.out.print("\n" + menu[i] + "\t");
        for (int j = 0; j < 7; j++){
            System.out.print(penjualan[i][j] + "\t");
        }
    }
        System.out.println();
        totalPenjualan(penjualan);
        System.out.println("total dari penjualan adalah: " + totalPenjualan(penjualan));

        penjualanTertinggi(penjualan);
        int indeksTertinggi = penjualanTertinggi(penjualan);
        System.out.println("Penjualan tertinggi adalah: " + menu[indeksTertinggi]);

        rataRataPenjualan(penjualan, menu);

    }// Fungsi main

    static void inputPenjualan(int[][] penjualan){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 7; j++){
                System.out.println("input hari " + (j + 1) + (": "));
                penjualan[i][j] = input.nextInt();
            }
        }
    }

    static int totalPenjualan(int[][] penjualan){
        int total = 0;
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 7; j++){
                total += penjualan[i][j];
            }
        }
        return total;
    }

    static int penjualanTertinggi(int[][] penjualan){
        int konsumsiTertinggi = 0;
        int index = 0;
        for (int i = 0; i < 5 ; i++){
            int tertinggi = 0;
            for (int j = 0; j < 7 ; j++) {
                tertinggi += penjualan[i][j];
                if (tertinggi > konsumsiTertinggi) {
                    konsumsiTertinggi = tertinggi;
                    index = i;
                }
            }
        }
        return index;
    }

    static void rataRataPenjualan(int[][] penjualan, String[] menu){
        for (int i = 0; i < 5; i++){
            int rataRata = 0;
            int rata = 0;
            for (int j = 0; j < 7; j++){
                rataRata += penjualan[i][j];
            }
            rata = rataRata / 7;
            System.out.println("Rata rata Penjualan menu " + menu[i] + ": " +  rata);
        }
    }

}
