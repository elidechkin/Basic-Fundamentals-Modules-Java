package AssociativeArrays;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                //"{force_side} | {force_user}".split(" | ") -> ["{force_side}", "{force_user}"]
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];
                //проверка дали имаме отбора
                if (!map.containsKey(team)) {
                    //отбор -> празен списък за играчите
                    map.put(team, new ArrayList<>());
                }
                //имаме такъв отбор -> добавяме към отбора играча, ако го няма в НИКОЙ ОТБОР
                boolean isExist = false; //играча го има в някой отбор
                for (List<String> list : map.values()) {
                    if (list.contains(player)) {
                        isExist = true;
                    }
                }
                if (!isExist) {
                    map.get(team).add(player);
                }

            } else if (input.contains("->")) {
                //"{force_user} -> {force_side}".split(" -> ") -> ["{force_user}", "{force_side}"]
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];

                //1. ако играч го има в някой от отборите -> remove
                map.entrySet().forEach(entry -> entry.getValue().remove(player));

                //2. проверка дали съществува отбора
                if (map.containsKey(team)) {
                    List<String> currentPlayers = map.get(team);
                    currentPlayers.add(player);

                } else {
                    //нямаме такъв отбор
                    //отбор -> празен списък за играчите
                    map.put(team, new ArrayList<>());
                    map.get(team).add(player);
                }

                System.out.printf("%s joins the %s side!%n", player, team);
            }

            input = scanner.nextLine();
        }

        //премахнем отборите, в които няма играчи
        //запис: отбор -> списък с играчи
        //filter -> оставяме само отговарящите на условието
        //премахваме всички, които entry.getValue().size() <= 0
        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0) //оставяме само тези записи, които отговарят на условието
                .forEach(entry -> {
                            //Side: Lighter, Members: 3
                            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                            entry.getValue().forEach(player -> System.out.println("! " + player));
                        }
                );
    }
}
