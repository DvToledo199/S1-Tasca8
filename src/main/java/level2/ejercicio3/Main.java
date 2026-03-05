package level2.ejercicio3;

public class Main {
    public static void main(String[] args){

        Operation addition = (number1, number2) -> number1 + number2;
        System.out.println("Addition: " + addition.operation(5, 20));

        Operation subtraction = (number1, number2) -> number1 - number2;
        System.out.println("Subtraction: " + subtraction.operation(34, 12));

        Operation multiplication = (number1, number2) -> number1 * number2;
        System.out.println("Multiplication: " + multiplication.operation(4, 80));

        Operation division = (number1, number2) -> number1 / number2;
        System.out.println("Division: " + division.operation(10, 2));
    }
}
