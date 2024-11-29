import java.util.Scanner;

public class SearchNilai222 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int panjang = scanner.nextInt();

        int[] nilaiMhs= new int[panjang];
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa " + (i + 1) + ": ");
            nilaiMhs[i] = scanner.nextInt();
        }

        int hasil = 0;
        System.out.print("Masukkan nilai yang dicari: ");
        int key2 = 0, key = scanner.nextInt();

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (key == nilaiMhs[i]) {
                hasil = i;
                key2 = i;
                break;
            } else {
                key2 = key;
            }
        }
       if (hasil == key2){
        System.out.println("Nilai "+key+ " adalah nilai mahasiswa ke-" + (hasil + 1));
       }else {
        System.out.println("Nilai "+key+ " tidak ditemukan");
       }
    }
}
