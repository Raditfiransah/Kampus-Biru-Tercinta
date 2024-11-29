package Tugas;
import java.util.Scanner;
public class Porseni22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah Pendaftar: ");
        int pendaftar = input.nextInt();

        for (int j = 1; j < pendaftar; j++){
            for (int i = 1 ; i <= 4; i++){
                System.out.println("Nama Cabor: ");
                String cabor = input.nextLine();
                input.nextLine();
                
                    for (int n = 1 ; n <= 5; n++){
                    System.out.println("Nama Atlet " + n + ": ");
                    String atlet = input.nextLine();
                    }
    
            }
        }
    }
}
