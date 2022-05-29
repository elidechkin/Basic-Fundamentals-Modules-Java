package WhileLoopExe;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int counterDay = 0;
        int counterSpendDay = 0;

        while (currentMoney < tripMoney && counterSpendDay < 5){

            String action = scanner.nextLine();
            double dayMoney = Double.parseDouble(scanner.nextLine());

            counterDay ++;

            if (action.equals("save")){
                currentMoney += dayMoney;
                counterSpendDay = 0;

            }else if (action.equals("spend")){
                currentMoney -= dayMoney;
                counterSpendDay ++;
                if (currentMoney < 0){
                    currentMoney = 0;
                }

            }

        }
        if (counterSpendDay == 5){
            System.out.printf("You can't save the money. %n");
            System.out.println(counterDay);

        }
        if (currentMoney >= tripMoney){
            System.out.printf("You saved the money for %d days.", counterDay);
        }
    }
}
