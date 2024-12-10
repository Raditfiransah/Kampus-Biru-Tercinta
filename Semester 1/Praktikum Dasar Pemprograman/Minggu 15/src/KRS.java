import java.util.Arrays;
import java.util.Scanner;

public class KRS {
        static String[] daftar = {"NIM", "Nama", "Kode MK", "Nama Mata Kuliah", "SKS"};
        static String[][] data = new String[100][4];
        static int[] sks = new int[100];
        static int index = 0;
        static int[] jumSKS= new int[100];
        static int totalSKS = 0;

    public static void main(String[] args) {
        pemantauan();
    }

    static void pemantauan() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Pemantauan KRS Mahasiswa ===");
        System.out.println("1. Tambah  Data KRS");
        System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
        System.out.println("3. Analisis Data KRS");
        System.out.println("4. Keluar");

        System.out.print("Masukkan Pilihan Anda : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                tambahData();
                break;
            case 2:
                tampilakanDaftar();
                break;
            case 3:
                break;
            case 4:
                System.out.println("Terimakasih");
                break;
            default:
                System.out.println("Pilihlah 1 - 4 ");
                pemantauan();
        }
    }

    static void tambahData() {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String tambahData = "";

        do {
                System.out.println("Masukkan Nama Mahasiswa: ");
                data[index][0] = input.nextLine();
                System.out.println("NIM");
                data[index][1] = input.nextLine();
                System.out.println("Kode Mata Kuliah");
                data[index][2] = input.nextLine();
                System.out.println("Nama Mata Kuliah");
                data[index][3] = input.nextLine();

            do {
                System.out.print("Jumlah SKS (1-3): ");
                sks[index] = input2.nextInt();

                if (sks[index] < 1 || sks[index] > 3) {
                    System.out.println("Masukkan SKS (1 - 3). Masukkan kembali.");
                } else {

                }
            } while (sks[index] < 1 || sks[index] > 3);

                index++;
                System.out.println("Apakah ingin menambah data");
                tambahData = input.nextLine();

        } while (tambahData.equalsIgnoreCase("iya"));
        pemantauan();
    }

    static void tampilakanDaftar(){
        Scanner input = new Scanner(System.in);
        String cari = "";

        System.out.println("Masukkan NIM Mahasiswa: ");
        cari = input.nextLine();

        System.out.println("=================== Daftar KRS Mahasiswa ===================");
        System.out.printf("%-15s %-10s %-10s %-25s %-5s%n", daftar[1], daftar[0], daftar[2], daftar[3], daftar[4]);

            for (int i = 0; i < index; i++) {
                if (data[i][1].equalsIgnoreCase(cari)){
                    System.out.printf("%-15s %-10s %-10s %-25s %-5s%n", data[i][0], data[i][1], data[i][2], data[i][3], sks[i]);

                }
            }

            System.out.println("Total SKS: " + jumSKS[index-1]);
            System.out.println();

        pemantauan();
    }
}
