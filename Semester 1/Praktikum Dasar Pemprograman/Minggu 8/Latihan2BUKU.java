import java.util.Scanner;
public class Latihan2BUKU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jenisBuku = "komik";
        int jumlahBuku = 1;
        double diskon = 0, diskonn =  0;


        if (jenisBuku.equals("kamus")){
            diskonn = 0.1;
            if (jumlahBuku > 2){
                diskon = diskonn + 0.02;
            }else {
                diskon = diskonn + 0;
            }
        }else if (jenisBuku.equals("novel")){
            diskonn = 0.07;
            if(jumlahBuku > 3){
                diskon = diskonn + 0.02;
            }else if (jumlahBuku <= 3){
                diskon = diskonn + 0.01;
            }
        }else {
            if (jumlahBuku > 3){
                diskon = 0.05;
            }
        }
        System.out.println("diskon: " + diskon);

}
}