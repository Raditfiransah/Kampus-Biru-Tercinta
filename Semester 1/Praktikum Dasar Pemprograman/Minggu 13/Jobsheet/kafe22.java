package Jobsheet;

public class kafe22 {
    public static void main(String[] args) {
        menu("RADIT", true, "DISKON30");
    }
    public static void menu(String namaPelanggan, boolean isMember, String kodePromo){
        System.out.println("SELAMAT DATANG, "+ namaPelanggan + "!");

        if (isMember){
            System.out.println("ANDA ADALAH MEMBER, DAPATKAN DISKON 10% UNTUK SETIAP PEMBELIAN!");
        }

        if (kodePromo.equals("DISKON50")){
            System.out.println("ANDA MANDAPATKAN DISKON 50%");
        }else if (kodePromo.equals("DISKON30")){
            System.out.println("ANDA MANDAPATKAN DISKON 30%");
        }else {
            System.out.println("KODE PROMO INVALID");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. KOPI HITAM - Rp 15.000");
        System.out.println("2. CAPPUCINO - Rp 20.000");
        System.out.println("3. LATTE - Rp 22.000");
        System.out.println("4. TEH TARIK - Rp 12.000");
        System.out.println("5 ROTI BAKAR - Rp 10.000");
        System.out.println("6. MIE GORENG - Rp 18.000");
        System.out.println("=========================");
    }
}
