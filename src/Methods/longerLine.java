package Methods;

import java.util.Scanner;

public class longerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());

        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());

        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());


        printCenterPoint(x1, y1, x2, y2, x3, y3, x4, y4);



    }
    public static void printCenterPoint(double x1, double y1, double x2, double y2,
                                        double x3, double y3, double x4, double y4){
        double firstPoint = Math.abs(x1 * y1) + Math.abs(x2 *y2);
        double secondPoint = Math.abs(x3 * y3) + Math.abs(x4 * y4);
        if (firstPoint >= secondPoint){
            if ((x1+y2) > (x2 + y2)){
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2);
            }else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2, y2, x1, y1);
            }

        }else {
            if ((x3+y4) > (x4 + y4)){
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x3, y3, x4, y4);
            }else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x4 , y4, x3, y3);
            }

        }
    }
}
