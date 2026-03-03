package level2.ejercicio1;

import java.util.List;

public class NameFilter {

    public static List<String> filterNames(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .toList();
    }


}
