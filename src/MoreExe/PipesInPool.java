package MoreExe;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer V = Integer.parseInt(scanner.nextLine());
        Integer P1 = Integer.parseInt(scanner.nextLine());
        Integer P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double totalPerHour = (P1+P2) * H;
        double rest = Math.abs(V - totalPerHour);
        double totalP1 = P1 * H;
        double percP1 = totalP1 / totalPerHour * 100;
        double totalP2 = P2 * H;
        double percP2 = totalP2 / totalPerHour * 100;


        if (totalPerHour < V){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalPerHour / 10, percP1,
                    percP2);

        }else if (totalPerHour > V){
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, rest);
        }
    }
}
