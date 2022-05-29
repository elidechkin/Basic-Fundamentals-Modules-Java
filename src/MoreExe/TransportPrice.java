package MoreExe;

import java.io.PrintStream;
import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String partDay = scanner.nextLine();

        double price = 0;

        if (partDay.equals("day")){
            if ( n < 20){
                price = 0.70 + n * 0.79;
            }else  if (n < 100){
                price = n * 0.09;
            }else {
                price = n * 0.06;
            }

        }else if (partDay.equals("night")){
            if ( n < 20){
                price = 0.70 + n * 0.90;
            }else  if (n < 100){
                price = n * 0.09;
            }else {
                price = n * 0.06;
            }
        }

        System.out.printf("%.2f", price);;
    }
}
