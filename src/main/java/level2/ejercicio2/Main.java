package level2.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>(
                List.of(3, 55, 44, 8, 11)
        );


        String formattedNumbers = NumberFormatter.numbersToString(numbers);

        System.out.println(formattedNumbers);
    }
}
