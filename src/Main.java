import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> dudes = new ArrayList<>(List.of(4,5,53,6,2));
        System.out.println(Service.isEven(dudes));
    }
}