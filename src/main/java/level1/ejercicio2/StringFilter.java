package level1.ejercicio2;
import java.util.List;

public class StringFilter {

    public static List<String> filterStringsContainingO(List<String> strings) {
        return strings.stream()
                .filter(brand -> brand.contains("o") && brand.length() > 5 )
                .toList();
    }


}
