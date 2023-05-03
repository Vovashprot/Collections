import java.util.ArrayList;
import java.util.List;

public class Service {
    public static List<Integer> isEven(List<Integer> input){
        List<Integer> output = new ArrayList<>(List.of());
        for (int i = 0; i < input.size(); i++){
            if (input.get(i) % 2 == 0){
                output.add(input.get(i));
            }
        }
        return output;
    }
}
