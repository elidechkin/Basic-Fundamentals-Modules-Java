package Object;

import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        while (!wordList.isEmpty()){
            Random rnd = new Random();
            int randomIndex = rnd.nextInt(wordList.size());

            String currentWord = wordList.get(randomIndex);
            System.out.println(currentWord);
            wordList.remove(randomIndex);
        }
    }
}
