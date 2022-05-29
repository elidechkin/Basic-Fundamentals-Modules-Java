package FirstStepInCoding.exe;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int packageDogFood = Integer.parseInt(scanner.nextLine());
        int packageCatFood = Integer.parseInt(scanner.nextLine());
        double dogFood = packageDogFood * 2.5;
        double catFood = packageCatFood * 4;

        double allSum = catFood + dogFood;


                System.out.println(allSum);

            }
        }

