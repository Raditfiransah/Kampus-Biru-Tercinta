import java.util.Scanner;
public class Absensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "jumat", "Sabtu", "Minggu"};
        
        System.out.println("Masukkan Nama Mahasiawa: ");
        int namaMahasiswa = input.nextInt();
        String[][] nama = new String [namaMahasiswa][2]; 

        for (int i = 0; i < nama.length; i++){
            System.out.println("Masukkan Nama Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < nama[i].length; j++){
                nama[i][j] = input.nextLine();
            }
        }
    }    
}
