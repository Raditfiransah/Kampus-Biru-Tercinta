import java.util.Scanner;
public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        
        double diskon, harga, totalBayar;
        System.out.println("----------------------");
        System.out.println("==== MENU KAFE JTI====");
        System.out.println("----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("Paket Bundling (Ricebowl + Ice tea)");
        System.out.println("-----------------------------------");
        System.out.println("Masukkan angak dari menu yang dipilih = ");
        int pilihanMenu = input22.nextInt();
        input22.nextLine();
        System.out.println("Apakah memepunyai member (y/n) :");
        String member = input22.nextLine();
        System.out.println("Apakah anda ingin melakukan pembayaran melalui Qris");
        String pembayaran = input22.nextLine();
        System.out.println("-----------------------------------");
        
        if (member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Anda mendapat diskon sebesar 10%.");
            if (pilihanMenu == 1){
                harga = 14000;
                System.out.println("Harga Ricebowl dengan diskon = " + harga);
            }else if (pilihanMenu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea dengan diskon = " + harga);
            }else if (pilihanMenu == 3){
                harga = 15000;
                System.out.println("Harga Paket Bundling Ricebowl + Ice Tea dengan diskon = " + harga);
            }else {
                System.out.println("Menu yang anda pilih salah.");
                return;
            } 
            
            totalBayar = harga - (harga * diskon); 
            
            System.out.println("Total harga yang harus dibayar = " + totalBayar);
        }else if(member.equalsIgnoreCase("n")){
            if (pilihanMenu == 1){
                harga = 14000;
                System.out.println("Harga Ricebowl dengan diskon = " + harga);
            }else if (pilihanMenu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea dengan diskon = " + harga);
            }else if (pilihanMenu == 3){
                harga = 15000;
                System.out.println("Harga Paket Bundling Ricebowl + Ice Tea dengan diskon = " + harga);
            }else {
                System.out.println("Menu yang anda pilih salah.");
                return;
            } 
            totalBayar = harga;
            System.out.println("Total harga: " + totalBayar);
        }else {
            System.out.println("member tidak valid");
            return;
        }
        if (pembayaran.equals("y")){
            totalBayar -= 1000;
            System.out.println("Total harga yang harus dibayar jika melalui Qris = " + totalBayar);
        }
}
}
