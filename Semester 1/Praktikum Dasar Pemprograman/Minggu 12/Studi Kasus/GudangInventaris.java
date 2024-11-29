import java.util.Scanner;
public class GudangInventaris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah jenis barang dan lokasi penympanan
        System.out.print("Masukkan jumlah jenis barang: ");
        int jenisBarang = input.nextInt();
        System.out.print("Masukkan jenis lokasi penyimpanan: ");
        int lokasiPenyimpanan = input.nextInt();
        // Done
        
        // Array
        int[][] barang = new int[jenisBarang][lokasiPenyimpanan];
        String[] kota = new String[lokasiPenyimpanan];
        // Array

        // Perulangan kota
        for (int i = 0; i < kota.length; i++){
        System.out.print("Masukkan nama kota ke-" + (i + 1) + ": ");
        kota[i] = input.next();
        }
        // kota

        // Input stok barang
        System.out.println("Mengisi stok barang");
        
        for (int i = 0; i < jenisBarang; i++){
            
                System.out.println("jenis barang: " );
                int jBarang = input.nextInt();
                
                System.out.println("lokasi barang: " );
                int lokasiB = input.nextInt();

                System.out.println("Tambah stok: " );
                int stok = input.nextInt();

                barang[jBarang - 1][lokasiB - 1]  = stok;
            
        }
        // Barang
        
        // Cetak stok barang
        System.out.println("Stok barang");

        for (int j = 0; j < kota.length; j++) {
            System.out.print("\t\s" + kota[j].toString());
        }
        System.out.println();

        for (int i = 0; i < jenisBarang; i++) {      
            System.out.print("\nBarang " + (i + 1) +": ");
            for (int j = 0; j < kota.length; j++) {
                System.out.print( barang[i][j] + "\t");
            }
        }
        // Stok barang

        // Total stok setiap jenis barang
        System.out.println("\nTotal stok setiap jenis barang");
        for (int i = 0; i < jenisBarang; i++) {
            int totalStok = 0;
            System.out.print("Barang " + (i + 1) + ": ");
            for (int j = 0; j < kota.length; j++) {
                totalStok += barang[i][j];
            }
            System.out.print(totalStok + "\t");
        }
       // Total stok setiap jenis barang

       System.out.println();

       // Total stok barang terbanyak
       for (int i = 0; i < barang.length; i++) {
        int max = 0;
        int index = 0;
        for (int j = 0; j < barang[i].length; j++) {
             if (barang[i][j] > max){
                max = barang[i][j];
                index = i;
             }
        }
        System.out.println("Jenis barang ke- " + (i + 1) + ": " + kota[index]);
        
        }
 
       
       // Total stok barang terbanyak
        input.close();
    }
}
