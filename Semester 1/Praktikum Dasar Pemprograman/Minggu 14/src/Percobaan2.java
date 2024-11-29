import java.util.Scanner;

public class Percobaan2 {
    static int hitungPangkat(int x, int y){
        if(y == 0){
            System.out.print("1 = ");
            return(1);
        }else {
            System.out.print(x + "x");
            return(x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bilangan yang dihitung: ");
        int bilangan = input.nextInt();
        System.out.println("Pangkat: ");
        int pangkat = input.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
