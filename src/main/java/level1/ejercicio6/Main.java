package level1.ejercicio6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Object> mixList = new ArrayList<>();
        mixList.add(500);
        mixList.add("Ana");
        mixList.add(34);
        mixList.add("Luis");
        mixList.add(7);
        mixList.add("Christopher");
        mixList.add(1234);
        mixList.add("Eva");
        mixList.add(89);
        mixList.add("Maximiliano");
        mixList.add(100000);
        mixList.add("Jo");
        mixList.add(42);
        mixList.add("Alexandra");
        mixList.add(3);
        mixList.add("Bo");

        MixedListSorter.sortByStringLength(mixList);
        System.out.println("Sorted list:");
        System.out.println(mixList);

    }
}
