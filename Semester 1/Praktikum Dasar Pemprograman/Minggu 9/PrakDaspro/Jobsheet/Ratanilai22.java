package Jobsheet;
import java.util.Scanner;

public class Ratanilai22 {
 public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

     int i, j;
     float nilai, totalNilai, rataNilai;


     for (i = 1; i <= 5;i++) {

        System.out.println();
         totalNilai = 0;
         j = 1;
         for (;j <= 5; j++) {

             System.out.println("Masukkan nilai ke-" + j + " : ");
             nilai = input.nextInt();
             totalNilai += nilai;

         }
         rataNilai = totalNilai / 5;
         System.out.println("Rata-rata nilai mahasiswa ke-" + i + " : " + rataNilai);

     }
 }   
}
