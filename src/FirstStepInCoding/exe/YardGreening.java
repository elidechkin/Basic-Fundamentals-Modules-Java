package FirstStepInCoding.exe;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double area =  Double.parseDouble(scanner.nextLine());
        Double priceWithoutDiscount = area * 7.61;
        Double discount = priceWithoutDiscount * 0.18;
        Double finalPrice = priceWithoutDiscount - discount;
        System.out.printf("The final price is: %f lv.", finalPrice);
        System.out.println();
        System.out.printf("The discount is: %f lv.", discount);

    }
}
