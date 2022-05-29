package Training;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int countDrink = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double totalPrice = 0;

        switch (drink){
            case "Espresso":
                if (sugar.equals("Without")){
                    price += 0.90;
                    totalPrice = price * countDrink;
                }else if (sugar.equals("Normal")){
                    price += 1;
                    totalPrice = price * countDrink;
                }else if (sugar.equals("Extra")){
                    price += 1.20;
                    totalPrice = price * countDrink;
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")){
                    price += 1;
                    totalPrice = price * countDrink;
                }else if (sugar.equals("Normal")){
                    price += 1.20;
                    totalPrice = price * countDrink;
                }else if (sugar.equals("Extra")){
                    price += 1.60;
                    totalPrice = price * countDrink;
                }
                break;
            case "Tea":
                if (sugar.equals("Without")){
                    price += 0.50;
                    totalPrice = price * countDrink;
                }else if (sugar.equals("Normal")){
                    price += 0.60;
                    totalPrice = price * countDrink;
                }else if (sugar.equals("Extra")){
                    price += 0.70;
                    totalPrice = price * countDrink;
                }
                break;
        }
        if (sugar.equals("Without")){
            totalPrice = totalPrice - ( totalPrice * 0.35);
        }
        if (drink.equals("Espresso") && countDrink >=5){
            totalPrice = totalPrice - ( totalPrice * 0.25);
        }
        if (totalPrice > 15){
            totalPrice = totalPrice - ( totalPrice * 0.20);
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", countDrink,drink, totalPrice);
    }
}
