package AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] wordArr = Arrays.stream(scanner.nextLine().split(" "))
                .filter(e -> e.length() % 2 == 0) // задаваме филтър с ламбда
                .toArray(String[]::new);// тук мъгла

        System.out.println(String.join(System.lineSeparator(), wordArr)); // този систем е сепаратор за нов ред


    }
}
// по бабешкия начин.
    //String[] wordsArr = scanner.nextLine().split(" ");
//
//        List<String> resultList = new ArrayList<>();
//        for (int i = 0; i < wordsArr.length; i++) {
//            int len = wordsArr[i].length();
//
//            if (len % 2 == 0) {
//                resultList.add(wordsArr[i]);
//            }
//        }
//
//        for (String s : resultList) {
//            System.out.println(s);
//        }