package FirstStepInCoding.lab;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fee = Integer.parseInt(scanner.nextLine());

        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double sneakersPrice = fee - (fee * 40 / 100.00);
        double outfitPrice = sneakersPrice - (sneakersPrice * 20 / 100);
        double ballPrice =  outfitPrice / 4;
        double accessoriesPrice = ballPrice / 5;

        double totalFee = fee + sneakersPrice + outfitPrice + ballPrice + accessoriesPrice;

        System.out.println(totalFee);

    }
}
