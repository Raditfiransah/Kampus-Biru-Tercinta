import java.util.Scanner;
public class java {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int bilangan;
        int bilaganGenap = 0, bilanganGanjil = 0; 
        boolean pilihan;

        
        do {
            System.out.print("Masukkan bilangan: ");
            bilangan = scanner.nextInt();
                if (bilangan % 2 == 0){
                    System.out.println(bilangan + " adalah bilangan genap");
                    bilaganGenap++;

                }else {
                    System.out.println(bilangan + " adalah bilangan ganjil");
                    bilanganGanjil++;
                }
                System.out.print("Masukkan bilangan lagi (Y/N)? ");
                pilihan = scanner.nextBoolean();
                scanner.nextLine();

        }while(pilihan);
        System.out.println("Jumlah bilangan genap: " + bilaganGenap);
        System.out.println("Jumlah bilangan ganjil: " + bilanganGanjil);
    }

}