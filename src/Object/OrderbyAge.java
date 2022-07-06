package Object;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderbyAge {
    //полета
    private String name;
    private String id;
    private int age;
    //конструктор, с алт + инсерт пряк достъп до конструктори, гетери, сетери

    public OrderbyAge(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    //методи

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String personalDate = scanner.nextLine();

        List<OrderbyAge> personList = new ArrayList<>();
        while (!personalDate.equals("End")){
            String name = personalDate.split(" ")[0];
            String id = personalDate.split(" ")[1];
            int age = Integer.parseInt(personalDate.split(" ")[2]);

            OrderbyAge person = new OrderbyAge (name, id, age);
            personList.add(person);


            personalDate = scanner.nextLine();

        }
        personList.sort(Comparator.comparing(OrderbyAge ::getAge));
        for (OrderbyAge person: personList) {
            System.out.printf("%s with ID: %s is %d years old.%n",
                    person.getName(),
                    person.getId(),
                    person.getAge());


        }
    }
}
