package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //създаваме си списък
        Map<String, String> parkingUsers = new LinkedHashMap<>();

        // н -реда за четене
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String command = data[0];
            String userName = data[1];

            //по команди
            switch (command) {
                case "register":
                    // четем лиценза
                    String license = data[2];

                    //проверка дали юзъра го има в списъка
                    if (!parkingUsers.containsKey(userName)) {
                        parkingUsers.put(userName, license); // добавяме юзъра
                        System.out.println(userName + " registered " + license + " successfully");
                    } else {
                        System.out.println("ERROR: already registered with plate number " + license);
                    }
                    break;

                case "unregister":
                    if (!parkingUsers.containsKey(userName)) {
                        System.out.println("ERROR: user " + userName + " not found");
                    } else {
                        parkingUsers.remove(userName);
                        System.out.println(userName + " unregistered successfully");
                    }
                    break;
            }

        }
        //печат с форцикъл
        parkingUsers.forEach((userName, license) -> System.out.println(userName + " => " + license));
    }
}
