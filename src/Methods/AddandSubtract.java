package Methods;

import java.util.Scanner;

public class AddandSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractThirdDigit(num1, num2, num3));

    }

    private static int sumFirstTwoDigit(int num1, int num2){
        return num1 + num2;
    }

    private static int subtractThirdDigit(int num1, int num2,int num3 ){
        int result = sumFirstTwoDigit(num1, num2) - num3;

        return result;
    }
}



