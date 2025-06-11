package materials;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        System.out.println("\nTREESET");
        Set<String> set = new TreeSet<>(); // compara elementos pelo toCompare
        Util.setAdd(set);
        Util.setPrint(set);
    }
}
