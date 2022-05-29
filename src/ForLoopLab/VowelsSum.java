package ForLoopLab;

import java.util.Locale;
import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        int suma = 0;
        for (int i = 0; i <=text.length() -1 ; i++) {
            char currentSymbol = text.charAt(i);

            switch (currentSymbol){
                case 'a':
                    suma +=1;
                    break;
                case 'e':
                    suma +=2;
                    break;
                case 'i':
                    suma +=3;
                    break;
                case 'o':
                    suma +=4;
                    break;
                case 'u':
                    suma +=5;
                    break;
            }



        }
        System.out.println(suma);
    }
}
