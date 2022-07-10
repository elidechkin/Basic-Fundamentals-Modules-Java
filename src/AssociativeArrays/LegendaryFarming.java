package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //shared = количесвто
        //fragments = количесвто
        //motes = количесвто

        //създаваме речник с трите записа и ст-стта им, добавяме ги
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        //запис: боклук с количество
        Map<String, Integer> junkItems = new LinkedHashMap<>();

        boolean isWin = false;

        while (!isWin){
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");
            for (int i = 0; i < inputData.length - 1 ; i+= 2) {//tuk въртим през един, защото вървят по двойки
                int quantity = Integer.parseInt(inputData[i]);//водещия вход
                String material = inputData[i + 1].toLowerCase();// другарчето му -> съседния символ

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")){
                    //валиден материал
                    int currentQuantity = items.get(material);
                    items.put(material, currentQuantity + quantity);

                }
                //материал боклук
                else {
                    if (!junkItems.containsKey(material)){
                        junkItems.put(material, quantity);
                    }else {
                        int current = junkItems.get(material);
                        junkItems.put(material, current + quantity);
                    }

                }
                //обработени всички материали
                //проверка дали сме спечелили
                if (items.get("shards") >= 250){
                    System.out.println("Shadowmourne obtained!");
                    items.put("shards", items.get("shards")- 250);
                    isWin = true;
                    break;
                } else  if (items.get("fragments") >= 250){
                    System.out.println("Valanyr obtained!");
                    items.put("fragments", items.get("fragments") - 250);
                    isWin = true;
                    break;
                }else if (items.get("motes") >= 250){
                    System.out.println("Dragonwrath obtained!");
                    items.put("motes", items.get("motes") - 250);
                    isWin = true;
                    break;
                }

            }
            if (isWin){
                break;
            }

        }

        // печатаме всички материали
        items.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        // печатаме боклуците
        junkItems.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}
