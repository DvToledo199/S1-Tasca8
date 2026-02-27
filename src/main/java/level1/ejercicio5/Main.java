package level1.ejercicio5;

public class Main {
    public static void main(String[] args) {

        PiValueProvider piProvider = () -> 3.1415;

        double piValue = piProvider.getPiValue();
        System.out.println(piValue);
    }
}
