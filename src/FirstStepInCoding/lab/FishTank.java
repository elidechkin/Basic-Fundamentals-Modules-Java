package FirstStepInCoding.lab;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);

        int length = Integer.parseInt(scannner.nextLine());
        int weith = Integer.parseInt(scannner.nextLine());
        int high = Integer. parseInt(scannner.next());
        double precent = Double.parseDouble(scannner.next());

        int volumeSM = length * weith * high;
         double volumeDS = volumeSM / 1000.00;

         double needL = volumeDS * (1 - precent / 100);

        System.out.println(needL);



    }
}
