package level1.ejercicio1;

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

        List<String> brandsWithO = StringFilter.filterStringsContainingO(carBrands);
        System.out.println("Car brands containing 'o':");
        System.out.println(brandsWithO);


    }
}
