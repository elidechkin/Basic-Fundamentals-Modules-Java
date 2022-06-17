package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList();

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList(); // четем два листа от входа

        List<Integer> resultList = new ArrayList<>(); // създаваме този, за да има къде да слагаме резултата
        int minSize = Math.min(firstList.size(), secondList.size());// мерим двата Лист-а и вземаме по-късия
        for (int i = 0; i < minSize; i++) { //въртим до по-късия
            int firstItem = firstList.get(i); // вземаме и елемнта от първия лист
            int secondItem = secondList.get(i);// същото

            resultList.add(firstItem); // добавяме първия Е в новия Лист
            resultList.add(secondItem);// добавяме втория Е в новия Лист
        }

        if (firstList.size() > secondList.size()) { // тази проверка я правим, защото единия Лист е по-дълъг и остават
            resultList.addAll(firstList.subList(minSize, firstList.size()));// неизползвани елементи, които трябва да добавим в новия Лист
        } else { // и тези елемнти ги правим на подлист/ subList/
            resultList.addAll(secondList.subList(minSize, secondList.size()));
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", "")); //печатаме така, за да разкараме всички
    }                                           //ненужни скоби, запетайки и т.н. от принта.

    }

// int minSize = Math.min(firstList.size(), secondList.size());
//        for (int i = 0; i < minSize; i++) {
//            int firstItem = firstList.get(i);
//            int secondItem = secondList.get(i);
//
//            resultList.add(firstItem);
//            resultList.add(secondItem);
//        }
//
