package Methods;

import java.util.Scanner;

public class centerPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());

        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());


        printCenterPoint(x1, y1, x2, y2);



    }
    public static void printCenterPoint(double x1, double y1, double x2, double y2){
        double firstPoint = Math.abs(x1 + y1);
        double secondPoint = Math.abs(x2 + y2);
        if (firstPoint < secondPoint){
            System.out.printf("(%.0f, %.0f)", x1, y1);
        }else{
            System.out.printf("(%.0f, %.0f)", x2, y2);
        }
    }
}
