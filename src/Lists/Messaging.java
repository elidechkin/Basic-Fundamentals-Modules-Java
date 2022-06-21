package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] currentNumber = scanner.nextLine().split("");
        List<String> text = Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());
        int sum = 0;
        int countDelete = 0;

        for (int i = 0; i < currentNumber.length; i++) {
            char currentChar = currentNumber[i].charAt(0);
            if (currentChar != 32) {
                sum += Integer.parseInt(currentNumber[i]);
            }
            if (currentChar == 32 || i == currentNumber.length - 1) {
                int counter = 0;
                if (text.size() - 1 == 0) {
                    System.out.print(" ");
                    text.remove(0);
                    break;
                }
                for (int j = 0; j < text.size(); j++) {
                    if (j == text.size() - 1) {
                        j = 0;
                    }
                    //counter++;
                    if (j == sum) {
                        System.out.print(text.get(j));
                        text.remove(j);
                        sum = 0;
                        break;
                    } else if (counter == sum) {

                        if ((int)text.indexOf(j-1)== -1){
                            System.out.print(text.get(text.size()-1));
                            break;
                        } else {

                            System.out.print(text.get(j-1));
                            text.remove(text.get(j-1));
                            sum = 0;
                            break;
                        }

                    }
                    counter++;


                }
            }
        }


    }
}
