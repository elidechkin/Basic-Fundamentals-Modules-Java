package Methods;

import java.util.Scanner;

public class dataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String input = scanner.nextLine();

        switch (type){
            case "int":
                int num = Integer.parseInt(input);
                printIntResult(num);
                break;
            case "real":
                double real = Double.parseDouble(input);
                printDoubleResult(real);
                break;
            case "string":
                printStringResult(input);
                break;
        }

    }
    public static void printIntResult( int num){
        num *= 2;
        System.out.println(num);
    }
    public static void printDoubleResult(double real){
        real *= 1.50;
        System.out.printf("%.2f", real);
    }
    public static void printStringResult(String input){
        System.out.printf("$%s$", input);
    }
}
