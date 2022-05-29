package FirstStepInCoding.exe;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                String architectName = scanner.nextLine();
                int projects = Integer.parseInt(scanner.nextLine());
                int neededTime = projects * 3;

                System.out.printf("The architect %s will need %d " +
                        "hours to complete %d project/s.", architectName, neededTime, projects );

            }

    }

