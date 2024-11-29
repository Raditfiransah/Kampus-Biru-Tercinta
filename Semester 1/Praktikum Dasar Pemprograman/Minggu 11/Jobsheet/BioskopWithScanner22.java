package Jobsheet;
import java.util.Scanner;
public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom;
        String nama,bintang = "***", next;
        String[][] penonton = new String[4][2];
        
        while (true){
            
            System.out.println("Masukkan Nama: " );
            nama = input.nextLine();
            System.out.println("Masukkan Baris: " );
            baris = input.nextInt();
            System.out.println("Masukkan Kolom: " );
            kolom = input.nextInt();
            
            for (int i = 0; i < penonton.length; i++){
                for (int j = 0; j < penonton[i].length; j++){
                    if (penonton[i][j] == null){
                        penonton[i][j] = "***";
                    }
                }
            }
            
            penonton[baris-1][kolom-1] = nama;
            
            
            
            System.out.println("Input penonton lainya? (y/n)");
            input.nextLine();
            next = input.nextLine();
            if (next.equalsIgnoreCase("n")){
                System.out.println("Daftar Penonton");
                for (int i = 0; i < penonton.length; i++){
                    for (int j = 0; j < penonton[i].length; j++){
                        System.out.print(penonton[i][j] + " ");
                    }
                }
                break;
            }
        }
    }
}
