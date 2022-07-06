package exam;

import java.util.Scanner;

public class SalesTour1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sea = Integer.parseInt(scanner.nextLine());
        int mountain = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double profitSea = 0;
        double profitMountain = 0;


        while (!input.equals("Stop")){

             if (input.equals("sea")){
                 if (sea <= 0){
                     profitSea += 0;
                 }else {
                     profitSea += 680;
                     sea --;
                 }

             }else if (input.equals("mountain")){
                 if (mountain <-0){
                     profitMountain +=0;

                 }else {
                     profitMountain += 499;
                     mountain --;

                 }

             }
             if (sea + mountain == 0){
                 System.out.println("Good job! Everything is sold.");
                 break;
             }
             input = scanner.nextLine();
        }
        System.out.printf("Profit: %.2f leva.", profitMountain + profitSea);
    }
}
