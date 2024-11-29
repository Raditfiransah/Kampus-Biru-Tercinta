package Jobsheet;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Numbers22 {
    public static void main(String[] args) {
        int[][] numbers = new int [3][];
        numbers[0] = new int[5];
        numbers[1] = new int[3];
        numbers[2] = new int[1];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Baris ke-" + (i+1) + ": " + numbers[i].length);
        }
    }
    
}
