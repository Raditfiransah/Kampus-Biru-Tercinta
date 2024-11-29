package Joobsheet;

import java.util.Scanner;

public class gajiKariawan22 {
    public static void main(String[] args) {
        int jamKerja, upahPerJam;
        double persenBonus = 0.1, persenPajak = 0.05;

        Scanner input = new Scanner(System.in);
        System.out.println("Jam Kerja: ");
        jamKerja = input.nextInt();
        System.out.println("Upah Per Jam: ");
        upahPerJam =input.nextInt();

        double totalGaji = jamKerja * upahPerJam;
        double bonus = (totalGaji*persenBonus);
        double pajak = persenPajak * (totalGaji+bonus);
        double gajiBersih = (totalGaji+bonus)-pajak;

        System.out.println("Total Gaji: " + totalGaji);
        System.out.println("Bonus: "+ bonus);
        System.out.println("Pajak: "+ pajak);
        System.out.println("Gaji Bersih: "+ gajiBersih);
    }
}
