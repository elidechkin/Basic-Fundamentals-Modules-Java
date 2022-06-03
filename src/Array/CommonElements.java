package Array;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String second : secondArr) {
            for (String first : firstArr) {
                if (second.equals(first)){
                    System.out.print(first + " ");
                }

            }
            
        }


    }
}
