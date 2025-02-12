import java.util.Scanner;

public class Percobaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input Total Mahasiswa");
        int totalMahasiswa = input.nextInt();
        System.out.println("Input Total Matkul");
        int totalMatkul = input.nextInt();
        System.out.println();

        String[][] namaMhs = new String[totalMahasiswa][1];
        String[][] namaMatkul = new String[totalMatkul][1];
        int[][] nilaiMhs = new int[totalMahasiswa][1];

        tampilan();
        int pilihan = input.nextInt();
        System.out.println();

        while (true) {
            switch (pilihan) {
                case 1:
                    masukkanNilai(namaMhs, namaMatkul, nilaiMhs, totalMahasiswa, totalMatkul);
                    break;
                case 2:
                    tampilkanNilai(namaMhs, namaMatkul, nilaiMhs, totalMahasiswa, totalMatkul);
                    break;
                case 3:
                    //rataRataNilai(namaMhs, namaMatkul, nilaiMhs, totalMahasiswa, totalMatkul);
                    break;
                case 4:
                    //cariNilaiTertinggi(namaMhs, namaMatkul, nilaiMhs, totalMahasiswa, totalMatkul);
                    break;
                case 5:
                    System.out.println("Terimakasih");
                    break;
                default:
                    System.out.println("Pilihan Salah!");
                    continue;
            }
        }



    }
    static void tampilan(){
        System.out.println("=== Aplikasi Manajemen Nilai Mahasiswa ===");
        System.out.println("1. Input Nilai Mahasiswa");
        System.out.println("2. Tampilkan Semua Nilai");
        System.out.println("3. Hitung Rata-rata Nilai Setiap Mahasiswa");
        System.out.println("4. Cari Nilai Tertinggi");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    static void masukkanNilai(String[][] namaMhs, String[][] namaMatkul, int[][]nilaiMhs, int totalMahasiswa, int totalMatkul){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        for (int i = 0; i < totalMatkul; i++) {
            System.out.print("Input Nama Matkul " + (i + 1) +": ");
            namaMatkul[i][0] = input.next();
        }

        for (int i = 0; i < totalMahasiswa; i++) {
            System.out.print("Input Nama Mahasiswa " + (i + 1) + ": ");
            namaMhs[i][0] = input.next();
            for (int j = 0; j < totalMatkul; j++) {
                System.out.println("Masukkan Nilai Matkul " + namaMatkul[j][0]);
                nilaiMhs[i][0] = input.nextInt();
            }
        }
        tampilan();
    }

    static void tampilkanNilai(String[][] namaMhs, String[][] namaMatkul, int[][]nilaiMhs, int totalMahasiswa, int totalMatkul){
        System.out.println("=================== Daftar KRS Mahasiswa ===================");

        for (int i = 0; i < totalMahasiswa; i++) {
            System.out.printf("%-15s",namaMatkul[i][0]);
            System.out.printf("%-15s %-10s %-10s %-25s %-5s%n");

        }
    }

}