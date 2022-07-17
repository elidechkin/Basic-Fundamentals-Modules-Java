package TextProcessing;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            String code = scanner.nextLine();

            int indexBeforeName = code.indexOf('@');
            int indexAfterName = code.indexOf('|');
            String name = code.substring(indexBeforeName + 1, indexAfterName);

            int indexBeforeAge = code.indexOf('#');
            int indexAfterAge = code.indexOf('*');
            String age = code.substring(indexBeforeAge + 1, indexAfterAge);


            System.out.printf("%s is %s years old.%n", name, age);


        }
    }
}
