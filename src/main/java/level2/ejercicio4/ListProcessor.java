package level2.ejercicio4;

import java.util.List;

public class ListProcessor {


    public static List<String> sortByFirstCharacter(List<String> elements) {
        return elements.stream()
                .sorted((firstElement, secondElement) ->
                        Character.compare(firstElement.charAt(0), secondElement.charAt(0)))
                .toList();
    }

    public static List<String> stringsWithEFirst(List<String> elements) {
        return elements.stream()
                .sorted((firstElement, secondElement) ->
                        Boolean.compare(secondElement.contains("e"), firstElement.contains("e")))
                .toList();
    }


    public static List<String> replaceAWith4(List<String> elements) {
        return elements.stream()
                .map(element -> element.replace('a', '4'))
                .toList();
    }


    public static List<String> filterNumericStrings(List<String> elements) {
        return elements.stream()
                .filter(element -> {
                    for (char c : element.toCharArray()) {
                        if (!Character.isDigit(c)) {
                            return false;
                        }
                    }
                    return true;
                })
                .toList();
    }


}
