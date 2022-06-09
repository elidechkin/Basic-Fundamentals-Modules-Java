package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widht = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        double area = calculateRectangleArea(widht, length);
        System.out.printf("%.0f", area);

    }
    public static int calculateRectangleArea(int width, int length) {
        return  width * length;

    }
}
