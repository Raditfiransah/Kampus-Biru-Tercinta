import java.util.Scanner;
public class Latihan1BILANGAN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil1 = 28,bil2 = 54, bil3 = 15, bilmax;
        
        if (bil1 > bil2){
            if (bil1 > bil3){
                bilmax = bil1;
        }else{
            bilmax = bil3;
        }
    }else{
            if (bil2 > bil3){
            bilmax = bil2;
            }else{
        bilmax = bil3;
    }
    System.out.println(bilmax);
    
}
    }
}