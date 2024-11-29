package Joobsheet;
import java.util.Scanner;

public class listrik22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double tafrifListrikPerKWH = 1500;
        int totalBayar, penggunaanListrik;
        
        System.out.println("Berapa penggunaan listik anda");
        penggunaanListrik = sc.nextInt();
        
        
        totalBayar = (int) (penggunaanListrik * tafrifListrikPerKWH);
        System.out.println("Penggunaan listrik anda adalah: "+ totalBayar);
        
        boolean melebihi500 = penggunaanListrik > 500 ;

        if (melebihi500) {
            System.out.println("Melebihi 500KWH");
        }

    }
}
