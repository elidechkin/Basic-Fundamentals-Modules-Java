package TrainingFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> journalList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String commands = scanner.nextLine();

        while(!commands.equals("Craft!")){
            String[] tokens = commands.split(" - ");
            String command = tokens[0];
            String item = tokens[1];
            switch (command){
                case "Collect":
                    if(!journalList.contains(item)){
                        journalList.add(item);
                    }
                    break;
                case "Drop":
                    if(journalList.contains(item)) {
                        journalList.remove(item);
                    }
                    break;
                case "Combine Items":
                    String[] comboLine = item.split(":");
                    String oldItem = comboLine[0];
                    String newItem = comboLine[1];
                    int index = journalList.indexOf(oldItem) + 1;
                    if(journalList.contains(oldItem)) {
                        journalList.add(index,newItem);
                    }
                    break;
                case "Renew":
                    if(journalList.contains(item)){
                        index = journalList.indexOf(item);
                        journalList.remove(item);
                        journalList.add(item);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.println(String.join(", ",journalList));

    }
}


