package coba;
import java.util.Scanner;
public class Coba2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};

            for (int i = 0 ; i <= 4; i++){
                System.out.println("Nama Cabor: "+ cabor[i]);
                
                    for (int n = 1 ; n <= 5; n++){
                    System.out.println("Nama Atlet " + n + ": ");
                    String atlet = input.nextLine();
                    }
    
            }
    }
}
