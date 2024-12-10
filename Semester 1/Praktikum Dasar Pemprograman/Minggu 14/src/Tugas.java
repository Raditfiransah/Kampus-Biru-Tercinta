import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int angka = input.nextInt();

        int[] n = new int[angka];

        for (int i = angka ; i >= 1; i--) {
            System.out.println("Masukkan angka ke-" + i + " : ");
            n[i - 1] = input.nextInt();
        }

        System.out.println("Total dari " + angka + " angka yang dimasukkan adalah : " + fungsiRekursif(n, angka));
    }

    static int fungsiIteratif(int[] n, int angka){
        int total = 0;
        for (int i = 0; i < n.length; i++) {
            total += n[i];
        }
        return total;
    }

    static int fungsiRekursif(int[] n, int angka){
        if (angka == 0) {
            return 0;
        }
        return n[angka - 1]+ fungsiRekursif(n, angka -1);
    }
}
