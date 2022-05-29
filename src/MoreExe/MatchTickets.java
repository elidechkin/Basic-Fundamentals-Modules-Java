package MoreExe;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int group = Integer.parseInt(scanner.nextLine());

        double trip = 0;
        double vipTicket = 499.99;
        double normalTicket = 249.99;


        if (group >= 1 && group <=4){
            trip = budget * 0.75;
        }else if ( group >= 5 && group <= 9){
            trip = budget * 0.60;
        }else if ( group >= 10 && group <= 24){
            trip = budget * 0.50;
        }else if ( group >= 25 && group <= 49){
            trip = budget * 0.40;
        }else {
            trip = budget * 0.25;
        }
        double diff = Math.abs(budget - trip);

        if (category.equals("VIP")){
            double priceTickets = vipTicket * group;
            if (diff >= priceTickets){
                System.out.printf("Yes! You have %.2f leva left.", diff - priceTickets);
            }else {
                System.out.printf("Not enough money! You need %.2f leva.", priceTickets - diff);
            }
        }else if (category.equals("Normal")){
            double priceTickets = normalTicket * group;
            if (diff >= priceTickets){
                System.out.printf("Yes! You have %.2f leva left.", diff - priceTickets);
            }else {
                System.out.printf("Not enough money! You need %.2f leva.", priceTickets - diff);
            }

        }

    }
}
