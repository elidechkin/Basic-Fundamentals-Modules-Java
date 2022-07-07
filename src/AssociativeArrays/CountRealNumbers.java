package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        //Два начина за четене на числата и добавянето им към Мап-а.

        Map<Double, Integer> countNumbersMap = new TreeMap<>();// нов мап, който ще пълнем
        for (double currentNum : numbersList) { // въртим листа
            countNumbersMap.putIfAbsent(currentNum, 0); // с путАбсента, добавяме ключ, ако го няма в Мап-а и му присвояваме ст=ст
            int currentValue = countNumbersMap.get(currentNum);// правим променлива за ст=тта
            countNumbersMap.put(currentNum, currentValue + 1);// добавяме нов ключ и увеличаваме броя им.


//            Integer currentValue = countNumbersMap.get(currentNum); тук с голям Инт, защото променливата няма ст=ст
//            if (countNumbersMap.containsKey(currentNum)) { проверка дали го има ключа в мапа и ако е го има
//                countNumbersMap.put(currentNum, currentValue + 1); добавяме само ст-тта към мапа
//            } else {
//                countNumbersMap.put(currentNum, 1);ако го няма, добавяме го
//            }
        }

        for (Map.Entry<Double, Integer> entry : countNumbersMap.entrySet()) {//
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
