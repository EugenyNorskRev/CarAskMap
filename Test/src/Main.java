import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Hello");
        set.add("Hello again");
        set.add("Hello");

        System.out.println(set);
    }
}
