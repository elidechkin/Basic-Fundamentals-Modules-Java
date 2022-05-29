package FirstStepInCoding.lab;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plastic = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double allPaint = paint + (paint * 10 / 100.00);
        int allPlastic = plastic + 2;


        double totalPlastic = allPlastic * 1.50;
        double totalPaint = allPaint * 14.50;
        double totalThinner = thinner * 5.00;

        double totalMat = (totalPaint + totalPlastic + totalThinner) + 0.40;
        double totalWork = (totalMat * 30 / 100.00) * workHours;
        double totalRep = totalMat + totalWork;

        System.out.println(totalRep);


    }
}
