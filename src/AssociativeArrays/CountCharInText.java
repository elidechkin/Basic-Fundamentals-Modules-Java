package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharInText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> symbolCount =  new LinkedHashMap<>();

        for (char symbol: text.toCharArray()) {
            if (symbol == ' '){ //ako срещнем интервал не го броим, а го прескачаме
                continue;
            }
            //ако не съм срещала до сега символа
            if (!symbolCount.containsKey(symbol)){
                symbolCount.put(symbol, 1);
            }
            //ако съм го срещала
            else {
                int currentCount = symbolCount.get(symbol);// създаваме брояч
                symbolCount.put(symbol, currentCount + 1); //добавяме още едно
            }

        }
        //речник: символ -> бр. срещания. бърз запис за печат с форЕ цъкъл
        //ентрисет - взема всички записи
        symbolCount.entrySet().
                forEach(entry -> System.out.println(entry.getKey() +" -> " + entry.getValue()));
        //друг вид запис за печат
        // forEach((key, value) -> sout(key + "->" + value)
    }
}
