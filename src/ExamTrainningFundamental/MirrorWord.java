package ExamTrainningFundamental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "(@|#)(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> pairs = new ArrayList<>();
        int countPairs = 0;

        while (matcher.find()){
            String firstWord = matcher.group("first");
            String secondWord = matcher.group("second");
            countPairs ++;

            StringBuilder secondWordBuileder = new StringBuilder(secondWord);
            String reversWord = secondWordBuileder.reverse().toString();

            if (firstWord.equals(reversWord)){
                pairs.add(firstWord + " <=> " + secondWord);
            }
        }
        if (countPairs == 0){
            System.out.println("No word pairs found!");
        }else {
            System.out.printf("%d word pairs found!%n", countPairs);
        }
        if (pairs.size() == 0){
            System.out.println("No mirror words!");
        }else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", pairs));
        }

    }
}
//•	If you don`t find any valid pairs, print: "No word pairs found!"
//•	If you find valid pairs print their count: "{valid pairs count} word pairs found!"
//•	If there are no mirror words, print: "No mirror words!"
//•	If there are mirror words print:
//"The mirror words are:
//{wordOne} <=> {wordtwo}, {wordOne} <=> {wordtwo}, … {wordOne} <=> {wordtwo}"