package AssociativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> wordsSynonym = new LinkedHashMap<>();// създаваме си мап-а, като ст-сттта е лист,
        //щото са няколко като брой и няма как с едно value
        for (int i = 0; i < n; i++) {// четем си всеки ред от конзолата
            String word = scanner.nextLine(); // четем си стандартно входа
            String synonym = scanner.nextLine();

            //проверка дали ключа го има
            if (!wordsSynonym.containsKey(word)){
                wordsSynonym.put(word, new ArrayList<>());
                wordsSynonym.get(word).add(synonym);
            }else {
                wordsSynonym.get(word).add(synonym);
            }
        }

        for (Map.Entry<String, List<String>> entry : wordsSynonym.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }

    }
}
