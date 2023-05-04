import java.util.*;

public class Service {
    public static List<Integer> isOdd(List<Integer> input){
        List<Integer> output = new ArrayList<>(List.of());
        for (int i = 0; i < input.size(); i++){
            if (input.get(i) % 2 != 0){
                output.add(input.get(i));
            }
        }
        return output;
    }
    public static Set<Integer> isEvenAndIncr(List<Integer> input){
        Set<Integer> output = new HashSet<>(List.of());
        for (int i = 0; i < input.size(); i++){
            if (input.get(i) % 2 == 0){
                output.add(input.get(i));
            }
        }
        return output;
    }
    public static Set<String> uniqueWords(List<String> input){
        Set<String> output = new HashSet<>(List.of());
        for (int i = 0; i < input.size(); i++){
                output.add(input.get(i));
        }
        return output;
    }

    public static Collection<Integer> uniqueWordsAndCountedRepeats(List<String> input){
        Map<String, Integer> repeats = new HashMap<>();
        for (int i = 0; i < input.size(); i++){
            if (repeats.containsKey(input.get(i))){
                repeats.put(input.get(i),repeats.get(input.get(i))+1);
            }
            else{
                repeats.put(input.get(i), 0);
            }
        }
        return repeats.values();
    }
}
