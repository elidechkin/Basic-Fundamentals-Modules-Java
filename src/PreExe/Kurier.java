package PreExe;

import java.util.Scanner;

public class Kurier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String typeCourier = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

       double allPrice = 0;

        if (typeCourier.equals("standard")){
            if (weight < 1){
                allPrice = distance * 0.03;
            } else if (weight >=1 && weight <=10){
                allPrice = distance * 0.05;
            } else if (weight >=11 && weight <=40){
                allPrice = distance * 0.10;
            } else if (weight >= 41 && weight <=90){
                allPrice = distance *0.15;
            } else if (weight >= 91 && weight <=150){
                allPrice = distance * 0.20;
            }
        } else if (typeCourier.equals("express")){
            if (weight < 1){
                allPrice = distance * 0.03 + 0.03 * 0.8 * weight * distance;
            } else if (weight >=1 && weight <=10){
                allPrice = distance * 0.05 + 0.05 * 0.4 * weight * distance;
            } else if (weight >=11 && weight <=40){
                allPrice = distance * 0.10 + 0.10 * 0.05 * weight * distance;
            } else if (weight >=41 && weight <=90){
                allPrice = distance * 0.15 + 0.15 * 0.02 * weight * distance;

            } else if (weight >=91 && weight <=150){
                allPrice = distance * 0.20 + 0.20 * 0.01 * weight * distance;

            }
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",weight,allPrice);

    }
}
