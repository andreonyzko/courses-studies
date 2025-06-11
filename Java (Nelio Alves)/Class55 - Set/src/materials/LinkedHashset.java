package materials;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {
    public static void main(String[] args) {
        System.out.println("\nLINKED HASHSET");
        Set<String> set = new LinkedHashSet<>();
        Util.setAdd(set);
        Util.setPrint(set);
    }
}
