import java.util.Scanner;
public class SIAKAD22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        
        nilaiAkhir =(nilaiKuis + nilaiTugas + uts  + uas)/4;
        
        String nilaiHuruf, kualifikasi;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";

        }else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
            kualifikasi = "Lebih Dari Baik";
        }else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        }else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
            kualifikasi = "Lebih Dari Cukup";
        }else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        }else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        }else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
        System.out.println("Kelas: "+ kelas);
        System.out.println("Absen: "+ absen);
        System.out.println("Nilai Huruf: "+ nilaiHuruf);
        System.out.println("Kualifikasi: "+ kualifikasi);
    }
}
