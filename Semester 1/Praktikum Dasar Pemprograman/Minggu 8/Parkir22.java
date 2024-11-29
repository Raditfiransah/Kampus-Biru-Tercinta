import java.util.Scanner;
public class Parkir22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
        System.out.println("Jenis Parkir");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("0 Keluar");
        System.out.println("------------");
        jenis = input.nextInt();

            if (jenis == 1 || jenis == 2){
                System.out.println("Durasi");
                durasi = input.nextInt();

                if (durasi > 5){
                    total += 12500;
                }else if (jenis == 1){
                    total += durasi * 3000;
                }else if (jenis == 2){
                    total += durasi * 2000;
                }
            }else if (jenis == 0){
                System.out.println("Totqal semua parkir hari ini: " + total);
                break;
            }else {
            System.out.println("Jenis parkir yang anda pilih salah.");
            }
            System.out.println("Total Biaya Parkir: " + total);


        }while(jenis != 0);
    }
}
