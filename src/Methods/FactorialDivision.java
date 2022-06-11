package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long fact1 = calculateFact(firstNum);
        long fact2 = calculateFact(secondNum);

        double result = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", result);



    }
    private static long calculateFact(int number){
        long factSum = 1;
        for (int i = 1; i <= number; i++) {
            factSum = factSum * i;
        }
        return factSum;
    }

}
