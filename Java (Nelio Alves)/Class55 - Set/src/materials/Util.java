package materials;
import java.util.Set;

public class Util {
    public static void setAdd(Set<String> set){
        set.add("Lucas");
        set.add("André");
        set.add("Kaua");
        set.add("Kaue");
        set.add("Larissa");
        set.add("Andrey");
        set.add("Diogo");
        set.add("Vitor");
    }

    public static void setPrint(Set<String> set){
        for(String obj : set) System.out.print(obj + "   ");
        System.out.println();
    }
}
