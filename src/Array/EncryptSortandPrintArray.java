package Array;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortandPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int [] array = new int [num];

        int sum = 0;

        for (int i = 0; i < num; i++) {
            char [] name = scanner.nextLine().toCharArray();
            for (char letter: name) {
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
                || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
                        letter *= name.length;
                        sum += letter;
                }else {
                    letter /= name.length;
                    sum += letter;
                }
            }
            array [i] = sum;
            sum = 0;
        }

        Arrays.sort(array);
        for (int elements:array) {
            System.out.println(elements);

        }

    }
}
//Напишете програма, която чете поредица от низове от конзолата. Шифровайте всеки низ чрез сумиране:
//• Кодът на всяка гласна, умножен по дължината на низа
//• Кодът на всяка съгласна, разделен на дължината на низа
//Сортирайте последователността от числа във възходящ ред и я отпечатайте на конзолата.
