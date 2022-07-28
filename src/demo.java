import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine(); //спирки: "Hawai::Cyprys-Greece"
        StringBuilder stopsBuilder = new StringBuilder(stops);

        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            //команда
            if (command.contains("Add Stop")) {
                //1. command = "Add Stop:7:Rome".split(":") -> ["Add Stop", "7", "Rome"]
                int index = Integer.parseInt(command.split(":")[1]);
                String stopName = command.split(":")[2];
                //1. валидиране на индекс
                if (isValidIndex(index, stopsBuilder)) {
                    stopsBuilder.insert(index, stopName);
                }
            } else if (command.contains("Remove Stop")) {
                //2. command = "Remove Stop:11:16".split(":") -> ["Remove Stop", "11", "16"]
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);

                if (isValidIndex(startIndex, stopsBuilder) && isValidIndex(endIndex, stopsBuilder)) {
                    stopsBuilder.delete(startIndex, endIndex + 1);
                }
            } else if (command.contains("Switch")) {
                //3. command = "Switch:Hawai:Bulgaria".split(":") -> ["Switch", "Hawai", "Bulgaria"]
                String oldStop = command.split(":")[1];
                String newStop = command.split(":")[2];
                //!!!!правим замяната само ако имаме такава спирка в първоначалния текст(stops)
                if (stops.contains(oldStop)) {
                    String updatedText = stopsBuilder.toString().replace(oldStop, newStop);
                    stopsBuilder = new StringBuilder(updatedText);
                }
            }

            System.out.println(stopsBuilder);
            command = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + stopsBuilder);
    }

    //метод, който валидира индекс в текста stopsBuilder
    //true -> ако индексът е валиден
    //false -> ако индексът не е валиден
    public static boolean isValidIndex(int index, StringBuilder builder) {
        return index >= 0 && index <= builder.length() - 1;


    }

    }

