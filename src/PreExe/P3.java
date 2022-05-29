package PreExe;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String service = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

        double priceDist = 0;
        double priceDiscount = 0;

        switch (service){
            case "standard":
                if (weight < 1){
                    priceDist *= 0.03;
                }else if ( weight >= 1 && weight < 10){
                    priceDist *= 0.05;
                }else if (weight >=10 && weight < 40){
                    priceDist *= 0.10;
                }else if (weight >= 40 && weight < 90){
                    priceDist *= 0.15;
                }else if (weight >=90 && weight < 150){
                    priceDist *= 0.20;
                }
                break;
            case "express":
                if (weight < 1){
                    priceDist *= 0.03;
                    priceDist = priceDist * 0.80;
                }else if ( weight >= 1 && weight < 10){
                    priceDist *= 0.05;
                    priceDist = priceDist * 0.40;
                }else if (weight >=10 && weight < 40){
                    priceDist *= 0.10;
                    priceDist = priceDist * 0.05;
                }else if (weight >= 40 && weight < 90){
                    priceDist *= 0.15;
                    priceDist = priceDist * 0.02;
                }else if (weight >=90 && weight < 150){
                    priceDist *= 0.20;
                    priceDist = priceDist * 0.01;
                }
                break;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight,priceDist );

    }
}
