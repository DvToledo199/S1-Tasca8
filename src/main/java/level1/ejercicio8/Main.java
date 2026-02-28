package level1.ejercicio8;

public class Main {
    public static void main(String[] args) {

        ReverseInterface reverser = ReverseService.createReverser();
        String result = reverser.reverse("Alfredo");
        System.out.println(result);


    }
}
