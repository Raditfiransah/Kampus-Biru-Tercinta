package Praktikum;
import java.util.Scanner;

public class Minggu3 {

    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    
    int lamaMenabung;
    double tabunganAwal, tabunganAkhir, bunga, persentaseBunga =0.02;
    
    tabunganAwal = input.nextInt();
    lamaMenabung = input.nextInt();

    bunga = lamaMenabung*persentaseBunga*tabunganAwal;
    tabunganAkhir = bunga+tabunganAwal;

    System.out.println(bunga);
    System.out.println(tabunganAkhir);
    }
}