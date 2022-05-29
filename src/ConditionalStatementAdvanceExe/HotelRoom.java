package ConditionalStatementAdvanceExe;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mes = scanner.nextLine();
        int night = Integer.parseInt(scanner.nextLine());

        double priceA = 0;
        double priceStudio = 0;

        //May, June, July, August, September или

        if ((mes.equals("May")) || (mes.equals("October"))){
            priceA = 65.00;
            priceStudio = 50.00;
            if (night > 7 && night <= 14){
                priceStudio = priceStudio - priceStudio * 0.05;
            }else if (night > 14){
                priceStudio = priceStudio - priceStudio * 0.30;
                priceA = priceA - priceA * 0.10;
            }

        }else if ((mes.equals("June")) || (mes.equals("September"))){
            priceA = 68.70;
            priceStudio = 75.20;
            if (night > 14){
                priceStudio = priceStudio - priceStudio * 0.20;
                priceA = priceA - priceA * 0.10;
            }


        }else if ((mes.equals("July")) || (mes.equals("August"))){
            priceA = 77.00;
            priceStudio = 76.00;
            if (night > 14){
                priceA = priceA - priceA * 0.10;
            }

        }
        System.out.printf("Apartment: %.2f lv. %n", priceA * night);
        System.out.printf("Studio: %.2f lv.", priceStudio * night);

    }
}
