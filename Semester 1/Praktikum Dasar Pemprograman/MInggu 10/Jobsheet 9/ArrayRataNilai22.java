import java.util.Scanner;
public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalLls = 0,totalTdkLls = 0 ,rataRataLls, rataRataTdkLls;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int panjang = scanner.nextInt();
        int lulus = 0, tdkLulus = 0;

        int[] nilaiMhs= new int[panjang];
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa " + (i + 1) + ": ");
            nilaiMhs[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < nilaiMhs.length; i++) {
           if (nilaiMhs[i] > 70){
                totalLls += nilaiMhs[i];
                lulus++;
            }
            if (nilaiMhs[i] < 70) {
                totalTdkLls += nilaiMhs[i];
                tdkLulus++;
            }
        }
        
        rataRataLls = totalLls / lulus;   
        rataRataTdkLls = totalTdkLls / tdkLulus;
        System.out.println("Rata-rata nilai lulus mahasiswa: " + rataRataLls);
        System.out.println("Rata-rata nilai tidak lulus mahasiswa: " + rataRataTdkLls);

        scanner.close();
    }
}
