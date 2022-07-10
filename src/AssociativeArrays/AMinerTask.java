package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> resourcesMap = new LinkedHashMap<>();

        while (!input. equals("stop")){
            int count = Integer.parseInt(scanner.nextLine());

            //проверка имам ли такъв ресурс
            //ако нямам такъв ресурс
            if (!resourcesMap.containsKey(input)){
                resourcesMap.put(input, count);
            }else{
                int currentCount = resourcesMap.get(input);
                resourcesMap.put(input, currentCount + count);
            }
            input = scanner.nextLine();

        }
        resourcesMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
