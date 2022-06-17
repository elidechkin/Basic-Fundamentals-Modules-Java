package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList();
        String input = scanner.nextLine();

        while (!input.equals("end")){
            List<String> commandLine = Arrays.stream(input.split(" ")).toList();//разбиваме прочетения ред на елем
            String command = commandLine.get(0);//четем първия, което е командата

            int item = 0;
            int index = 0;

            switch (input){
                case "Add":
                    item = Integer.parseInt(commandLine.get(1));
                    numList.add(item);
                    break;
                case "Remove":
                    break;
                case "RemoveAt":
                    break;
                case "Insert":
                    break;
            }
            input = scanner.next();

        }

    }
}

//Add {number}: add a number to the end of the list
//Remove {number}: remove a number from the list
//RemoveAt {index}: remove a number at a given index
//Insert {number} {index}: insert a number at a given index
