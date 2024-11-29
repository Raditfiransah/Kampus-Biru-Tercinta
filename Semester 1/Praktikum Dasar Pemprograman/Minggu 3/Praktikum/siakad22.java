package Praktikum;
import java.util.Scanner;

public class siakad22 {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, uas, uts, nilaiAkhir;
        
        System.out.println("Masukkan Nama:");
        nama = scanner.nextLine();
        System.out.println("Masukkan NIM:");
        nim = scanner.nextLine();
        System.out.println("Masukkan Kelas:");
        kelas = scanner.nextLine().charAt(0);
        System.out.println("Masukkan Nomor Absen:");
        absen = scanner.nextByte();
        System.out.println("Masukkan Nilai Kuis:");
        nilaiKuis = scanner.nextDouble();
        System.out.println("Masukkan Nilai Tugas:");
        nilaiTugas = scanner.nextDouble();
        System.out.println("Masukkan Nilai UTS:");
        uts = scanner.nextDouble();
        System.out.println("Masukkan Nilai UAS:");
        uas = scanner.nextDouble();

        nilaiAkhir = ((nilaiKuis * 0.20) + (nilaiTugas * 0.15) + ( uts * 0.35) + (uas * 0.30));

        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
        System.out.println("Kelas: "+ kelas);
        System.out.println("Absen: "+ absen);
        System.out.println("Nilai Akhir: "+ nilaiAkhir);
        
        
    }
}
