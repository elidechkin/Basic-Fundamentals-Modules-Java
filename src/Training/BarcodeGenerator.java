package Training;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int firstOne = firstNum / 1000;
        int firstTwo = firstNum / 100 %10;
        int firstThree = firstNum / 10 % 10;
        int firstFour = firstNum % 10;
        int secondtNum = Integer.parseInt(scanner.nextLine());
        int secondOne = secondtNum/ 1000;
        int secondTwo = secondtNum/ 100 %10;
        int secondThree = secondtNum / 10 % 10;
        int secondFour = secondtNum % 10;

        for (int i = firstOne; i <= secondOne ; i++) {
            for (int j = firstTwo; j <= secondTwo ; j++) {
                for (int k = firstThree; k <= secondThree ; k++) {
                    for (int l = firstFour; l <= secondFour ; l++) {

                        if (i % 2 !=0 && j % 2 != 0 && k % 2 != 0 && l % 2 !=0 ){
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }


                    }

                }

            }

        }


    }

}
