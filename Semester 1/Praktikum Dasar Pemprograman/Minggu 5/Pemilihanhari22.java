package Minggu5;

import java.util.Scanner;

public class Pemilihanhari22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayName, dayTipe;

        System.out.print("Enter the day: ");
        dayName = scanner.nextLine();

        switch (dayName.toLowerCase()) {
            case "sunday":
            case "monday":
            case "tuesday": 
            case "wednesday":               
            case "thursday":
            case "friday":
                dayTipe = "Weekdays";
                break;
            case "saturday":
                dayTipe = "Weekend";
                break;
            default:
                dayTipe = " Invalid day name";
        }
}
}