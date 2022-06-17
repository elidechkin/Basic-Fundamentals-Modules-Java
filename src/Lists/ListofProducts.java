package Lists;

import java.util.*;

import static java.util.Collections.*;

public class ListofProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<>();// създаваме лист


        for (int i = 0; i < n; i++) { //въртим го, за да го напълним от конзолата
            String product = scanner.nextLine();

            productList.add(product);// добавяме всеки прочетен ред към лист-а
        }
        sort(productList); //сортираме го във възх.ред

        for (int i = 0; i < productList.size(); i++) {// обичайното го въртим, за да прочетем всеки елемент,
            System.out.printf("%d.%s%n", i + 1, productList.get(i));//   и да го отпечатаме

        }
    }
}
