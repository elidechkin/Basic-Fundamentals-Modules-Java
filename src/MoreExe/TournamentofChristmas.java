package MoreExe;

import java.util.Scanner;

public class TournamentofChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());


        int winGame = 0;
        int loseGame = 0;
        double reisedmoney = 0;

        for (int i = 1; i <= days ; i++) {
            int win = 0;
            int lose = 0;
             double moneyPerDay = 0;
            String input = scanner.nextLine();

            while (!input.equals("Finish")){

                if (input.equals("win")){
                    win ++;
                    winGame ++;
                    moneyPerDay += 20;

                }else if (input.equals("lose")){
                    loseGame ++;
                    lose ++;
                }else if (input.equals("Finish")){

                    break;
                }

                input = scanner.nextLine();

            }
            if (win > lose){
                moneyPerDay += moneyPerDay * 0.10;
                reisedmoney += moneyPerDay;
            }else {
                reisedmoney += moneyPerDay;
            }

            }

        if (winGame > loseGame){
            reisedmoney += reisedmoney * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", reisedmoney);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", reisedmoney);
        }


    }
}
