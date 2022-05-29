package MoreExe;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String season = scanner.nextLine();
        String children = scanner.nextLine();
        int countChildren = Integer.parseInt(scanner.nextLine());
        int night = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0;

        switch (season){
            case "Winter":
                if ((children.equals("girls")) || (children.equals("boys"))){
                    pricePerNight = countChildren * night * 9.60;

                }else if (children.equals("mixed")){
                    pricePerNight = countChildren * night * 10.00;
                }
                break;
            case "Spring":
                if ((children.equals("girls")) || (children.equals("boys"))){
                    pricePerNight = countChildren * night * 7.20;

                }else if (children.equals("mixed")){
                    pricePerNight = countChildren * night * 9.50;
                }
                break;
            case "Summer":
                if ((children.equals("girls")) || (children.equals("boys"))){
                    pricePerNight = countChildren * night * 15.00;

                }else if (children.equals("mixed")){
                    pricePerNight = countChildren * night * 20.00;
                }
                break;

        }

        if (countChildren >= 50){
            pricePerNight = pricePerNight - (pricePerNight * 0.50);

        }else if (countChildren >= 20){
            pricePerNight = pricePerNight - (pricePerNight * 0.15);

        }else if (countChildren >= 10){
            pricePerNight = pricePerNight - (pricePerNight * 0.05);

        }

        switch (season){
            case "Winter":
                if (children.equals("boys")){
                    System.out.printf("Judo %.2f lv.", pricePerNight);

                }else if (children.equals("girls")){
                    System.out.printf("Gymnastics %.2f lv.", pricePerNight);

                }else{
                    System.out.printf("Ski %.2f lv.", pricePerNight);

                }
                break;
            case "Spring":
                if (children.equals("boys")){
                    System.out.printf("Tennis %.2f lv.", pricePerNight);

                }else if (children.equals("girls")){
                    System.out.printf("Athletics %.2f lv.", pricePerNight);

                }else{
                    System.out.printf("Cycling %.2f lv.", pricePerNight);

                }
                break;
            case "Summer":
                if (children.equals("boys")){
                    System.out.printf("Football %.2f lv.", pricePerNight);

                }else if (children.equals("girls")){
                    System.out.printf("Volleyball %.2f lv.", pricePerNight);

                }else{
                    System.out.printf("Swimming %.2f lv.", pricePerNight);

                }
                break;

        }


    }
}
