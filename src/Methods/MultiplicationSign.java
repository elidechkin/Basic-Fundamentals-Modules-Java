package Methods;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        if (isZero(num1, num2, num3)){
            System.out.println("zero");
        }else if (isNegative(num1, num2, num3)){
            System.out.println("negative");
        }else {
            System.out.println("positive");
        }


    }

    private static boolean isZero(int num1, int num2, int num3){
        if (num1 == 0 || num2 == 0 || num3 == 0){
            return true;
        }
        return false;
    }
    private static boolean isPositive(int num1, int num2, int num3){
        if (num1 >0 && num2 > 0 && num3 > 0){
            return true;
        }
        return false;
    }
    private static boolean isNegative(int num1, int num2, int num3){
        int[] numbers = new int[] { num1, num2, num3 };
        int counter = 0;
        for (int i = 0; i < 3; i++)
        {
            if (numbers[i] < 0)
            {
                counter++;
            }
        }
        if (counter % 2 == 0)
        {
            return false;
        }
        return true;
    }

}
