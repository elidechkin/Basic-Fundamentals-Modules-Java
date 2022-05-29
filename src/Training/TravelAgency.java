package Training;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String type = scanner.nextLine();
        String discount = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double pricePerDay = 0;
        boolean flag = false;

        switch (town){
            case "Bansko":
                case "Borovets":
                if (type.equals("noEquipment")){
                    pricePerDay =  80;
                    if (discount.equals("yes")){
                        pricePerDay = pricePerDay - (pricePerDay * 0.05);
                    }
                }else if ((type.equals("withEquipment"))){
                    pricePerDay = 100;
                    if (discount.equals("yes")){
                        pricePerDay = pricePerDay - (pricePerDay * 0.10);
                    }
                }else {
                    flag = true;
                }
                break;

            case "Varna":
                    case "Burgas":
                if (type.equals("noBreakfast")){
                    pricePerDay = 100;
                    if (discount.equals("yes")){
                        pricePerDay = pricePerDay - (pricePerDay * 0.07);
                    }

                }else if ( type. equals("withBreakfast")){
                    pricePerDay = 130;
                    if (discount.equals("yes")){
                        pricePerDay = pricePerDay - (pricePerDay * 0.12);
                    }
                }else {
                        flag = true;
                    }
                break;
            default:
                flag = true;
                break;

        }
        if (days >= 7){
            days --;
            price = days * pricePerDay;
        }else {
            price = days * pricePerDay;
        }
        if (days < 1){
            System.out.println("Days must be positive number!");
        } else  if (flag){
            System.out.println("Invalid input!");
        }else {
            System.out.printf("The price is %.2flv! Have a nice time!",price);
        }




    }
}
