package PreExe;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String service = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

                double allPrice = 0.0;


                if (service.equals("standard")){
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
                } else if (service.equals("express")){
                    if (weight < 1){
                        allPrice = allPrice + 0.8 * 0.03 *distance * weight;
                    } else if (weight >=1 && weight <=10){
                        allPrice = allPrice + 0.4 * 0.05 *distance * weight;
                    } else if (weight >=11 && weight <=40){
                        allPrice = allPrice + 0.05 * 0.10 *distance * weight;
                    } else if (weight >=41 && weight <=90){
                        allPrice = allPrice + 0.02 * 0.15 * distance * weight;
                    } else if (weight >=91 && weight <=150){
                        allPrice = allPrice + 0.01* 0.20 *distance * weight;
                    }
                }
                System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",weight,allPrice);

            }
        }


