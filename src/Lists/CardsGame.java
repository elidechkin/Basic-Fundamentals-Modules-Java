package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        // //1. взимам първата карта от ръката
        //        //2. премахвам картата от ръката
        //        //3. проверка кой печели:
        //        // карта 1 > карта 2 -> слагам накрая на ръката на първия -> карта 1 -> карта 2
        //        //карта 2 > карта 1 -> слагам накрая на ръката на втория -> карта 2 -> карта 1
        //        //карта 1 == карта 2 -> не ги добавяме никъде
        //
        //        //играта продължава когато и двамата имат карти
        //        //играта спира, когато някой остане без карти

        while (firstPlayer.size() != 0 && secondPlayer.size() != 0){
            int firstCard = firstPlayer.get(0);
            int secondCard = secondPlayer.get(0);
            firstPlayer.remove(0);
            secondPlayer.remove(0);


            if (firstCard > secondCard){
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
            }else if (firstCard < secondCard){
                secondPlayer.add(secondCard);
                secondPlayer.add(firstCard);
            }
        }
        //   //1. ако на първия му свършат картите
        if (firstPlayer.size() == 0){
            // //втория печели -> сума от картите на втория
            System.out.printf("Second player wins! Sum: %d",getCardsSum(secondPlayer));

        }else if (secondPlayer.size() == 0){
            System.out.printf("First player wins! Sum: %d", getCardsSum(firstPlayer));
        }

        }
    private static int getCardsSum(List<Integer> listCards){
        int sum = 0;
        for ( int card: listCards) {
            sum += card;
        }
        return sum;
    }
    }


