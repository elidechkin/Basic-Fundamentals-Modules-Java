package Training;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJoyneri = Integer.parseInt(scanner.nextLine());
        String typeJouneri = scanner.nextLine();
        String receiving = scanner.nextLine();

        double price = 0;




        switch (typeJouneri){
            case "90X130":
                price = countJoyneri * 110;
                if (countJoyneri >= 30 && countJoyneri <= 59){
                    price -= price * 0.05;
                }else if (countJoyneri >= 60){
                    price -= price * 0.08;
                }
                break;
            case "100X150":
                price = countJoyneri * 140;
                if (countJoyneri >= 40 && countJoyneri <= 79){
                    price -= price * 0.06;
                }else if (countJoyneri >= 80){
                    price -= price * 0.10;
                }
                break;
            case "130X180":
                price = countJoyneri * 190;
                if (countJoyneri >= 20 && countJoyneri <= 49){
                    price -= price * 0.07;
                }else if (countJoyneri >= 50){
                    price -= price * 0.12;
                }
                break;
            case "200X300":
                price = countJoyneri * 250;
                if (countJoyneri >= 25 && countJoyneri <= 49){
                    price -= price * 0.09;
                }else if (countJoyneri >= 50){
                    price -= price * 0.14;
                }
                break;
        }
        if (receiving.equals("With delivery")){
            price += 60;
        }
            if (countJoyneri > 99){
            price -= price * 0.04;
        }

        if (countJoyneri < 10){
            System.out.println("Invalid order");

        }else {
            System.out.printf("%.2f BGN", price);
        }



    }
}
