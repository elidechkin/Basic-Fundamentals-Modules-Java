package izpit;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int days=1;
        int altitude=5364;
        int currentAscend=0;
        while(!input.equals("END")){
            if(input.equals("Yes")){
                days++;
            }
            currentAscend  = Integer.parseInt(scanner.nextLine());
            altitude+=currentAscend;
            if(altitude>=8848||days==5) break;

            input = scanner.nextLine();
        }
        if(altitude>=8848){
            System.out.printf("Goal reached for %d days!",days);
        }else {
            System.out.printf("Failed!%n");
            System.out.printf("%d",altitude);
        }
    }
}
