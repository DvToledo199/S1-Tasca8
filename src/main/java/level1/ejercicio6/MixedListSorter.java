package level1.ejercicio6;

import java.util.List;

public class MixedListSorter {

    public static List<Object> sortByStringLength(List<Object> mixList){
        mixList.sort((obj1, obj2) -> {

            if (obj1 instanceof String && obj2 instanceof String) {
                String s1 = (String) obj1;
                String s2 = (String) obj2;
                return Integer.compare(s1.length(), s2.length());
            }

            if (obj1 instanceof String) {
                return 1;
            }

            if (obj2 instanceof String) {
                return -1;
            }

            return 0;
        });
        return mixList;
    }
}
