package TrainingFundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")){
            String [] commandsLine = input.split(" ");
            String command = commandsLine[0];
            int index = Integer.parseInt(commandsLine[1]);
            int value = Integer.parseInt(commandsLine[2]);

            switch (command){
                case "Shoot":
                    if (isValidIndex(targetList, index)){
                        int currentNum = targetList.get(index);
                        currentNum = currentNum - value;
                        if (currentNum <= 0) {
                            targetList.remove(index);
                        } else {
                            targetList.set(index, currentNum);
                        }
                    }
                    break;
                case "Add":
                    if (isValidIndex(targetList, index)) {
                        targetList.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    boolean validIndexRadius = targetList.size() - 1 >= index
                            && targetList.size() - 1 >= index + value
                            && index - value >= 0;
                    if (validIndexRadius) {
                        int radius = value * 2 + 1;
                        for (int i = 0; i < radius; i++) {
                            targetList.remove(index - value);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            input = scanner.nextLine();

        }
        List<String> resultList = new ArrayList<>();
        for (int target : targetList) {
            resultList.add(String.valueOf(target));
        }
        System.out.println(String.join("|", resultList));
    }
    private static boolean isValidIndex (List<Integer> list, int index){
        return  index >= 0 && index <= list.size() - 1;
    }
}
