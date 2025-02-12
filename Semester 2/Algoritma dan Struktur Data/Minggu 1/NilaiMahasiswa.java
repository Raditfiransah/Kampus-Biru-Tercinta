import java.util.Scanner;

public class NilaiMahasiswa {

    // Fungsi untuk menghitung rata-rata nilai
    public static double hitungRataNilai(double[] nilai, int jumlahMatkul) {
        double total = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            total += nilai[i];
        }
        return total / jumlahMatkul;
    }

    // Fungsi untuk menentukan status kelulusan
    public static String tentukanKelulusan(double rata) {
        if (rata >= 75) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = scanner.nextInt();

        // Proses input dan perhitungan untuk setiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai untuk Mahasiswa ke-" + (i + 1) + ":");
            double[] nilai = new double[jumlahMatkul];

            // Input nilai untuk setiap mata kuliah
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai Mata Kuliah ke-" + (j + 1) + ": ");
                nilai[j] = scanner.nextDouble();
            }

            // Hitung rata-rata nilai
            double rata = hitungRataNilai(nilai, jumlahMatkul);
            // Tentukan status kelulusan
            String status = tentukanKelulusan(rata);

            // Tampilkan hasil
            System.out.println("Mahasiswa ke-" + (i + 1) + " memiliki rata-rata nilai = " + rata + " dan dinyatakan: " + status);
            System.out.println("---------------------------------------");
        }

        scanner.close();
    }
}
