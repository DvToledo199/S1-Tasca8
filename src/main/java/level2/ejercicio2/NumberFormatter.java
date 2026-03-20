package level2.ejercicio2;

import java.util.List;
import java.util.stream.Collectors;

public class NumberFormatter {

    public static String numbersToString(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(", "));
    }
}
