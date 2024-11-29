import java.util.Scanner;
public class Pemilihan2percobaan322{
    public static void main(String[] args){
        Scanner input22 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak;

        System.out.println("Kategori: ");
        kategori = input22.nextLine();
        System.out.println("Penghasilan: ");
        penghasilan = input22.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")){
            if (penghasilan <= 2000000){
                pajak = 0.1;
            } else if (penghasilan <= 3000000){
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Gaji Bersih: " + gajiBersih);
        }else if (kategori.equals("pebisnis")){
            if (penghasilan <= 2500000){
                pajak = 0.12;
            } else if (penghasilan <= 3500000){
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Gaji Bersih: " + gajiBersih);
        }else{
            System.out.println("Kategori yang anda pilih salah.");
        }
}
}

