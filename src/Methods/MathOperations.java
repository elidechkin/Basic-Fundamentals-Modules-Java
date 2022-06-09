package Methods;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String actionType = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(calculate(firstNum, actionType, secondNum)));


        }

    public static double calculate(int first, String action, int second) {
        double result = 0;
        switch (action) {
            case "*":
                result = first * second;
                break;
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "/":
                result = first / (second * 1.00);
                break;

        }
        return result;
    }
}


