package level1.ejercicio8;

public class ReverseService {

    public static ReverseInterface createReverser() {

        return (text) -> {
            StringBuilder reversedText = new StringBuilder();

            for (int i = text.length() - 1; i >= 0; i--) {
                reversedText.append(text.charAt(i));
            }

            return reversedText.toString();
        };
    }
}
