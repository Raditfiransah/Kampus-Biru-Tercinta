package Tugas;

import java.util.Scanner;

public class KubusNoAbsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sisi: ");
        int sisi = input.nextInt();
        int volumeKubus = volume(sisi);
        int luasKubus = luas(sisi);

        System.out.println("Volume Kubus: " + volumeKubus);
        System.out.println("Luas Kubus: " + luasKubus);

        input.close();
    }
    static int volume(int sisi){
        int V = sisi * sisi * sisi;
        return V;
    }
    static int luas(int sisi){
        int L = 6 * sisi * sisi;
        return L;
    }
}
