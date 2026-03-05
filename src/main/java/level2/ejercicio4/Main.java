package level2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> elements = new ArrayList<>(
                List.of("car", "456", "banana", "tree", "123", "apple", "house")
        );

        List<String> sortedByFirstCharacter = ListProcessor.sortByFirstCharacter(elements);
        System.out.println(sortedByFirstCharacter);

        List<String> stringsWithEFirst = ListProcessor.stringsWithEFirst(elements);
        System.out.println(stringsWithEFirst);

        List<String> replacedAWith4 = ListProcessor.replaceAWith4(elements);
        System.out.println(replacedAWith4);

        List<String> numericStrings = ListProcessor.filterNumericStrings(elements);
        System.out.println(numericStrings);

    }
}
