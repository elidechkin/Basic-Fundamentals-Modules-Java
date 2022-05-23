package BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (type){
            case "Students":
                if (day.equals("Friday")){
                    price = 8.45 * group;
                }else if (day.equals("Saturday")){
                    price = 9.80 * group;
                }else if (day.equals("Sunday")){
                    price = 10.46 * group;
                }
                if (group >= 30){
                    price = price - price * 0.15;
                }
                break;
            case "Business":
                if ( group >= 100){
                    group -= 10;
                }
                if (day.equals("Friday")){
                    price = 10.90 * group;
                }else if (day.equals("Saturday")){
                    price = 15.60 * group;
                }else if (day.equals("Sunday")){
                    price = 16 * group;
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    price = 15 * group;
                }else if (day.equals("Saturday")){
                    price = 20 * group;
                }else if (day.equals("Sunday")){
                    price = 22.50 * group;
                }
                if (group >= 10 && group <= 20){
                    price = price - price * 0.05;
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
