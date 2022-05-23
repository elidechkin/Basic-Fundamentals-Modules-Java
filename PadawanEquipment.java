package BasicSyntaxConditionalStatementsLoops;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceLightbers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double totalPriceLightbers = Math.ceil(countOfStudents + countOfStudents * 0.10) * priceLightbers;
        double totalPriceRobes = countOfStudents * priceRobes;
        double totalPriceBelts = (countOfStudents - (countOfStudents / 6)) * priceBelts;

        double totalPrice = totalPriceLightbers + totalPriceRobes + totalPriceBelts;



        if (amountOfMoney >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - amountOfMoney);
        }
    }
}
