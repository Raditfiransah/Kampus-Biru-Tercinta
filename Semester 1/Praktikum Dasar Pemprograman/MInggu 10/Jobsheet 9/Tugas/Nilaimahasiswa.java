package Tugas;
import java.util.Scanner;
public class Nilaimahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah mahasiswa");
        int jmlMahasiswa = input.nextInt();

        int[] mahasiswa = new int[jmlMahasiswa];
        int total = 0 ;

        for (int i = 0; i < jmlMahasiswa; i++){
            System.out.println("Nilai mahasiswa ke-" + (i+1));
            mahasiswa[i] = input.nextInt();
        }

        for (int i = 0; i < jmlMahasiswa; i++){
            total += mahasiswa[i];
        }
        double rataRata = total/jmlMahasiswa;

        int max = mahasiswa[0], min = mahasiswa[0];

        for (int i = 0; i < jmlMahasiswa; i++){
            if (mahasiswa[i] > max){
                max = mahasiswa[i];
            }
            if (mahasiswa[i] < min){
                min = mahasiswa[i];
            }
        }

        
        for (int i = 0; i < jmlMahasiswa; i++){
            System.out.println("Nilai Mahasiswa ke-"+ (i+1)  +" : " + + mahasiswa[i]);
        }
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
    }
}
