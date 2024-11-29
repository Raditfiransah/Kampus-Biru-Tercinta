import java.util.Scanner;
public class for22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidaklulus = 0;

        for (int i = 1; i <= 3; i++){
            System.out.print("Nilai mahasiswa ke " + i +": " );
            nilai = sc.nextDouble();

            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
            if (nilai < 60 ){
                tidaklulus++;
            }else {
                lulus++;
            }
            }
        System.out.println("tertinggi: " + tertinggi);
        System.out.println("terendah: " + terendah);
        System.out.println("lulus: " + lulus);
        System.out.println("tidak lulus: " + tidaklulus);


        }

    }
