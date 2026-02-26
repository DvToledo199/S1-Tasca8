package level1.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        ArrayList<String> carBrands = new ArrayList<>(
                List.of(
                        "Subaru",
                        "Lancia",
                        "Ford",
                        "Toyota",
                        "Peugeot",
                        "Mitsubishi",
                        "Porsche",
                        "Alpine")
        );
        System.out.println("Original car brands:");
        System.out.println(carBrands);

        System.out.println();


        List<String> brandsWithOAndMoreThanFiveLetters = StringFilter.filterStringsContainingO(carBrands);
        System.out.println("Car brands containing 'o' and more than 5 letters:");
        System.out.println(brandsWithOAndMoreThanFiveLetters);



    }
}
