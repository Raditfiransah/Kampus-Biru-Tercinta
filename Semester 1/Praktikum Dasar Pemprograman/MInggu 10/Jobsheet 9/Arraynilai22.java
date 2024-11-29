import java.util.Scanner;
public class Arraynilai22 {
    public static void main(String[] args) {
        int[] nilaiakhir = new int [10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiakhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+ " : ");
            nilaiakhir[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiakhir.length; i++) {
            if (nilaiakhir[i] > 70){
            System.out.println("Masukkan ke-"+i+ " lulus");
            }else {
                System.out.println("Masukkan ke-"+i+ " tidak lulus");
            }
        } 

    }
}
