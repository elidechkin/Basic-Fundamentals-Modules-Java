package ForLoopExe;

import java.util.Scanner;

public class Oscar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameAct = scanner.nextLine();
        double point = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= n; i++) {
            String juriName = scanner.nextLine();
            double juriPoint = Double.parseDouble(scanner.nextLine());
            int length = juriName.length();

           point = point + (length * juriPoint) / 2;

            if( point >= 1250.50) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameAct, point);
                break;
            }

        }
        if ( point < 1250.50){
            System.out.printf("Sorry, %s you need %.1f more!", nameAct, 1250.50 - point);
        }


    }

}

