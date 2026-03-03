package level2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(
                List.of(
                        "Ary", "Aeg", "Jon", "Ned", "Robb", "Bran", "Sansa", "Olenna"
                )
        );

        List<String> filteredNames = NameFilter.filterNames(names);

        System.out.println(filteredNames);
    }
}
