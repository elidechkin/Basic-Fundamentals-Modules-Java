package exam;

import java.util.Scanner;

public class Grandfather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double amounRakia = 0;
        double amountDegrees = 0;

        for (int i = 1; i <= days; i++) {
            double rakiaPerDay = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());

            amounRakia += rakiaPerDay;
            amountDegrees += rakiaPerDay * degrees;

        }
        double averigeDegrees = amountDegrees / amounRakia;

        System.out.printf("Liter: %.2f%n", amounRakia);
        System.out.printf("Degrees: %.2f%n", averigeDegrees);

        if (averigeDegrees < 38){
            System.out.println("Not good, you should baking!");

        }else if ( averigeDegrees >= 38 && averigeDegrees < 42){
            System.out.println("Super!");

        }else if (averigeDegrees >= 42 ){
            System.out.println("Dilution with distilled water!");

        }
    }
}
