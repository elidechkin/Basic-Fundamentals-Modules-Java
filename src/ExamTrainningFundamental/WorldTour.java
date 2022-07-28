package ExamTrainningFundamental;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        String command = scanner.nextLine();

        StringBuilder stopBuilder= new StringBuilder(stops);
        while (!command.equals("Travel")){
            if (command.contains("Add Stop")){
                //•	"Add Stop:{index}:{string}":
                int index = Integer.parseInt(command.split(":")[1]);
                String stopName = command.split(":")[2];
                if (index>= 0 && index <= stopBuilder.length() - 1){
                    stopBuilder.insert(index, stopName);
                }
            }else if (command.contains("Remove Stop")){
                //•	"Remove Stop:{start_index}:{end_index}":
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);
                if (startIndex>= 0 && startIndex <= stopBuilder.length() - 1
                        && endIndex >= 0 && endIndex <= stopBuilder.length()-1){
                    stopBuilder.delete(startIndex, endIndex +1);
                }
            }else if (command.contains("Switch")){
            //•	"Switch:{old_string}:{new_string}":
                String oldStop = command.split(":")[1];
                String newStop = command.split(":")[2];
                if (stops.contains(oldStop)) {
                    String update = stopBuilder.toString().replace(oldStop, newStop);
                    stopBuilder= new StringBuilder(update);
                }

            }
            System.out.println(stopBuilder);
            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stopBuilder);
    }

}
