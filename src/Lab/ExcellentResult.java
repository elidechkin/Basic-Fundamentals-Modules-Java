package Lab;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);

        int grade = Integer.parseInt(scannner.nextLine());

        if (grade >= 5){
            System.out.println("Excellent!");
        }
    }
}
