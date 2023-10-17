import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceLowerCase {
    public static void main(String[] args) {
        List<String> listOfNames = Arrays.asList(new String[]
                {"Apple", "Banana", "Cherry"});

        System.out.println(listOfNames);

        List<String> sublist = listOfNames.stream()
                .map(s -> Character.toLowerCase(s.charAt(0)) + s.substring(1))
                .sorted()
                .collect(Collectors.toList());
        
        System.out.println("º¯È¯ ÈÄ: " + sublist);
    }
}
