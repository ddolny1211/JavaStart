import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        //funkcja przyjmuje String i zwraca String
        Function<String, String> func = text -> text.toLowerCase().trim();
        String original = "   WIELKI NAPIS  ";
        //wywołujemy funkcję przekazująć jej oryginał jako parametr
        String loweCaseTrim = func.apply(original);
        System.out.println(loweCaseTrim);

    }
}
