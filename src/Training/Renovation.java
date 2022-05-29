package Training;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int windows = Integer.parseInt(scanner.nextLine());
         String input = scanner.nextLine();

        int counter = 0;
        double area = Math.ceil(height * width * 4);
        double clearArea = area - (area * windows / 100);

         while (!input.equals("Tired!")){
             int paint = Integer.parseInt(input);
              clearArea -= paint;

              if (clearArea <= 0){
                  break;
              }
             input = scanner.nextLine();

         }
        if (clearArea > 0){
            System.out.printf("%.0f quadratic m left.", clearArea);
        }else if (clearArea == 0){
            System.out.println("All walls are painted! Great job, Pesho!" );
        }else {
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(clearArea));
        }

    }
}
