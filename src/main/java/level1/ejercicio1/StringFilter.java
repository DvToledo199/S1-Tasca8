package level1.ejercicio1;
import java.util.List;

public class StringFilter {

    public static List<String> filterStringsContainingO(List<String> strings) {
        return strings.stream()
                .filter(brand -> brand.contains("o"))
                .toList();
    }


}
