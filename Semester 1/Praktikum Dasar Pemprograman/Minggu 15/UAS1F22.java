public class Latihan {
    import java.util.Scanner;

    public class UAS1F22 {
        public static void tampilkanMenu() {
            System.out.println("=== Aplikasi Manajemen Nilai Mahasiswa ===");
            System.out.println("1. Input Nilai Mahasiswa");
            System.out.println("2. Tampilkan Semua Nilai");
            System.out.println("3. Hitung Rata-rata Nilai Setiap Mahasiswa");
            System.out.println("4. Cari Nilai Tertinggi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
        }

        public static void tampilkanNilai(int[][] nilai, String[] mahasiswa, String[] matkul) {
            System.out.println("\n=== Semua Nilai Mahasiswa ===");
            System.out.print("Mahasiswa\t");
            for (String m : matkul) {
                System.out.print(m + "\t");
            }
            System.out.println();

            for (int i = 0; i < nilai.length; i++) {
                System.out.print(mahasiswa[i] + "\t\t");
                for (int j = 0; j < nilai[i].length; j++) {
                    System.out.print(nilai[i][j] + "\t\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Fungsi untuk menghitung rata-rata nilai setiap mahasiswa
        public static void hitungRataRata(int[][] nilai, String[] mahasiswa) {
            System.out.println("\n=== Rata-rata Nilai Setiap Mahasiswa ===");
            for (int i = 0; i < nilai.length; i++) {
                int total = 0;
                for (int j = 0; j < nilai[i].length; j++) {
                    total += nilai[i][j];
                }
                double rataRata = (double) total / nilai[i].length;
                System.out.printf("Rata-rata nilai %s: %.2f\n", mahasiswa[i], rataRata);
            }
            System.out.println();
        }

        // Fungsi untuk mencari nilai tertinggi
        public static void cariNilaiTertinggi(int[][] nilai, String[] mahasiswa, String[] matkul) {
            int nilaiTertinggi = nilai[0][0];
            int indeksMahasiswa = 0, indeksMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                for (int j = 0; j < nilai[i].length; j++) {
                    if (nilai[i][j] > nilaiTertinggi) {
                        nilaiTertinggi = nilai[i][j];
                        indeksMahasiswa = i;
                        indeksMatkul = j;
                    }
                }
            }

            System.out.println("\n=== Nilai Tertinggi ===");
            System.out.println("Nilai tertinggi adalah " + nilaiTertinggi +
                    " oleh " + mahasiswa[indeksMahasiswa] +
                    " di mata kuliah " + matkul[indeksMatkul] + "\n");
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan jumlah mahasiswa: ");
            int jumlahMahasiswa = input.nextInt();
            System.out.print("Masukkan jumlah mata kuliah: ");
            int jumlahMatkul = input.nextInt();

            String[] mahasiswa = new String[jumlahMahasiswa];
            String[] matkul = new String[jumlahMatkul];
            int[][] nilai = new int[jumlahMahasiswa][jumlahMatkul];

            System.out.println("\nMasukkan nama-nama mahasiswa:");
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
                mahasiswa[i] = input.next();
            }

            System.out.println("\nMasukkan nama-nama mata kuliah:");
            for (int i = 0; i < jumlahMatkul; i++) {
                System.out.print("Mata kuliah ke-" + (i + 1) + ": ");
                matkul[i] = input.next();
            }

            int pilihan;
            do {
                tampilkanMenu();
                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("\n=== Input Nilai Mahasiswa ===");
                        for (int i = 0; i < jumlahMahasiswa; i++) {
                            System.out.println("Masukkan nilai untuk " + mahasiswa[i] + ":");
                            for (int j = 0; j < jumlahMatkul; j++) {
                                System.out.print(matkul[j] + ": ");
                                nilai[i][j] = input.nextInt();
                            }
                        }
                        break;

                    case 2:
                        tampilkanNilai(nilai, mahasiswa, matkul);
                        break;

                    case 3:
                        hitungRataRata(nilai, mahasiswa);
                        break;

                    case 4:
                        cariNilaiTertinggi(nilai, mahasiswa, matkul);
                        break;

                    case 5:
                        System.out.println("Terima kasih! Program selesai.");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid! Silakan coba lagi.\n");
                        break;
                }
            } while (pilihan != 5);

            input.close();
        }
    }

}
