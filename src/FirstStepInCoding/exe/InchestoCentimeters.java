package FirstStepInCoding.exe;

import java.util.Scanner;

public class InchestoCentimeters {
    public static void main(String[] args) {
        Scanner scaner = new Scanner (System.in);
        double inches = Double.parseDouble(scaner.nextLine());
        double results = inches * 2.54;
        System.out.println(results);




    }
}
