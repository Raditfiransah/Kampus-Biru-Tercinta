package Jobsheet;

public class Bioskop22 {
    public static void main(String[] args) {
        String[][] penonton = new String [4][2];

        penonton[0][0] = "amin";
        penonton[0][1] = "bena";
        penonton[1][0] = "chandra";
        penonton[1][1] = "dela";
        penonton[2][0] = "eka";
        penonton[2][1] = "farhan";
        penonton[3][0] = "gisel";
        penonton[3][1] = "hana";

        /*System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);

        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);*/

        // System.out.println(penonton.length);

        // for(int i = 0; i < penonton.length; i++){
        //     System.out.println("Panjang baris ke-"+ (i + 1)+ " : "+ penonton[i].length);
        // }

        // System.out.println(penonton.length);
        
        // for(String[] barisPenonton : penonton){
        //     System.out.println("Panjang baris ke-"+ barisPenonton.length);
        // }

        // System.err.println("Penonton pada baris ke-3: ");

        // for (int i = 0; i < penonton[2].length; i++) {
        //     System.out.printf(penonton[2][i]);            
        // }

        // System.err.println("Penonton pada baris ke-3: ");

        // for (String i : penonton[2]) {
        //     System.out.println(i);
        // }

        for (int i = 0; i < penonton.length; i++){
            System.out.println("penonton baris ke-" + (i+1) + ": " + String.join(",",penonton[i]));
        }
    }
}