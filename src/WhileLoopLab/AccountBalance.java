package WhileLoopLab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String imput = scanner.nextLine();
        double sum = 0;

        while (!imput.equals("NoMoreMoney")){
            double currentSum = Double.parseDouble(imput);

            if (currentSum <= 0){
                System.out.println("Invalid operation!");
                break;
            }
            sum += currentSum;
            System.out.printf("Increase: %.2f %n", currentSum);

            imput = scanner.nextLine();

        }
        System.out.printf("Total: %.2f", sum);
    }
}
