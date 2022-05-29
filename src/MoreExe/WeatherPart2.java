package MoreExe;

import java.util.Scanner;

public class WeatherPart2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        double temp = Double.parseDouble(scann.nextLine());

        if ( temp >= 26 && temp <= 35 ){
            System.out.println("Hot");
        }else if (temp >= 20.1 && temp <=25.9){
            System.out.println("Warm");
        }else if (temp >= 15 && temp <= 20){
            System.out.println("Mild");
        }else if (temp >= 12 && temp <= 14.9){
            System.out.println("Cool");
        }else if (temp >= 5 && temp <= 11.9){
            System.out.println("Cold");
        }else {
            System.out.println("unknown");
        }
    }
}
