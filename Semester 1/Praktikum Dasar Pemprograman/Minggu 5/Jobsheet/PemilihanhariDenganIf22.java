import java.util.Scanner;
public class PemilihanhariDenganIf22 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int hari;

        System.out.print("Masukkan hari (1-7): ");
        hari = input.nextInt();

        switch (hari) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.print("Weekday");
                break;
            case 6:
            case 7:
                System.out.print("Weekend");
                break;
        
            default:
            System.out.print("Invalid Number");
                break;
        }

    }
}