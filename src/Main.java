import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> dudes = new ArrayList<>(List.of(4,5,53,6,2));
        List<String> words = new ArrayList<>(List.of("один", "один", "два","два", "два"));
        System.out.println(Service.isOdd(dudes));
        System.out.println(Service.isEvenAndIncr(dudes));
        System.out.println(Service.uniqueWords(words));
        System.out.println(Service.uniqueWordsAndCountedRepeats(words));
    }
}