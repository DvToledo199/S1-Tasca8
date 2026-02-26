package level1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        ArrayList<String> months = new ArrayList<>(
                List.of(
                        "January",
                        "February",
                        "March",
                        "April",
                        "May",
                        "June",
                        "July",
                        "August",
                        "September",
                        "October",
                        "November",
                        "December")
        );
        MonthPrinter.printMonths(months);

    }
}
