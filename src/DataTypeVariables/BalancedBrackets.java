package DataTypeVariables;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countOpen = 0;
        int countClos = 0;
        boolean isBalanced = false;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

             if (input.equals("(")){
                 countOpen ++;

             }else if (input.equals(")")){
                 countClos ++;
                 if (countClos > countOpen){
                     isBalanced = false;
                     break;

                 }
             }
        }
        if (countOpen == countClos){
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }
    }
}
