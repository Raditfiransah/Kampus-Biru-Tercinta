package Tugas;
import java.util.Scanner;

public class Cafepencarian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"nasi goreng","mie goreng", "roti bakar", "kentang goreng", "teh tarik", "cappucino", "chocolate ice" };
    
        System.out.print("Nama menu: ");
        String Key = input.nextLine();
        boolean key2 = true;
        int indeks = 0;

        for (int i = 0; i < menu.length; i++) {
            if (Key.equalsIgnoreCase(menu[i])) {
                key2 = true;
                indeks = i;
                break;
            }
            else {
                key2 = false;
            }
        }
        if (key2 == true) {
        System.out.print("menu ada di indeks ke-" + (indeks + 1));
        }
        else {
            System.out.println("menu tidak ditemukan");
        }
    }
}
