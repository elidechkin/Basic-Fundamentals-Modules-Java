package ExeOficial;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред - месецът - текст с възможности: "march", "april", "may", "june", "july", "august"
        //•	На втория ред - броят на прекараните часове - цяло число в диапазона [1...10]
        //•	На третия ред - броят на хората в групата -  цяло число в диапазона [1...10]
        //•	На четвъртия ред - времето от деня – текст с възможности: "day" или "night
        String mes = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        String timeOfDay= scanner.nextLine();

        double price = 0;

        switch (mes){
            case "march":
            case "april":
            case "may":
                if (timeOfDay.equals("day")){
                    price = 10.50;
                }else {
                    price = 8.40;
                }
                break;
            case "june":
            case "july":
            case "august":
                if (timeOfDay.equals("day")){
                    price = 12.60;
                }else {
                    price = 10.20;
                }
                break;

        }
        if (people >= 4){
          price = price - (price * 0.10);
        }
        if (hours >=5){
            price = price - (price * 0.50);

        }
        System.out.printf("Price per person for one hour: %.2f%n", price);
        System.out.printf("Total cost of the visit: %.2f", price * hours * people);

    }
}
