package ForLoopExe;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tab = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        double newSalary = 0;


        for (int i = 1; i <= tab ; i++) {
            String n = scanner.nextLine();
            switch (n){
                case "Facebook":
                    newSalary +=150;
                    break;
                case "Instagram":
                    newSalary += 100;
                    break;
                case "Reddit":
                    newSalary += 50;
                    break;
                default:
                    break;
            }
        }
        double total = salary - newSalary;
        if (total <= 0){
            System.out.println("You have lost your salary.");
        }else {
            System.out.printf("%.0f", total);
        }
    }
}
