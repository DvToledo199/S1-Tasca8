package level2.ejercicio2;

import java.util.List;
import java.util.stream.Collectors;

public class NumberFormatter {

    public static String numbersToString(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> {
                    if (number % 2 == 0) {
                        return "e" + number;
                    } else {
                        return "o" + number;
                    }
                })
                .collect(Collectors.joining(", "));
    }
}
