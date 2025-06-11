package materials;
import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        System.out.println("HASHSET");
        Set<String> set = new HashSet<>(); // testa igualdade pelo hashcode e equals
        Util.setAdd(set);
        Util.setPrint(set);
    }
}

