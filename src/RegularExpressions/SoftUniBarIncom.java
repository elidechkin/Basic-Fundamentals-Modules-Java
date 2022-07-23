package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

        String regex="^%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|" +
                "(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$$";

        Pattern patter=Pattern.compile(regex);
        double sum=0;

        while(!input.equals("end of shift")){

            Matcher matcher=patter.matcher(input);
            while(matcher.find()){
                double a =Double.parseDouble(matcher.group("count"));
                double b= Double.parseDouble(matcher.group("price"));
                System.out.println(String.format("%s: %s - %.2f",matcher.group("name"),matcher.group("product"),a*b));
                sum+=a*b;
            }


            input=scanner.nextLine();


        }
        System.out.println(String.format("Total income: %.2f",sum));
    }
}
