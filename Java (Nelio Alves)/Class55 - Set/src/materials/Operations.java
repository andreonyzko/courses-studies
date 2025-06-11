package materials;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Operations {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        Util.setAdd(set);
        Util.setPrint(set);
        Set<String> founders = new TreeSet<>(List.of("André", "Kaua", "Jose"));
        Set<String> owners = new TreeSet<>(List.of("André", "Kaua", "Lucas", "Kaii"));
        Set<String> members = new TreeSet<>(List.of("Diogo","Lari","Andrey","Vitor"));

        // OPERAÇÕES
        System.out.println("\nAdding Samuel:");
        set.add("Samuel");
        Util.setPrint(set);

        System.out.println("\nRemoving Samuel: ");
        set.remove("Samuel");
        Util.setPrint(set);

        System.out.println("\nRemoving all wich starts with 'A': ");
        set.removeIf(x -> x.charAt(0) == 'A');
        Util.setPrint(set);

        System.out.println("\nAndré is at list? " + set.contains("André"));
        System.out.println("And Kaua? " + set.contains("Kaua"));

        // UNION
        Set<String> users = new TreeSet<>(members);
        users.addAll(owners);
        System.out.println("\nUsers (Members + owners): " + users);

        // INTERSECTION
        Set<String> presentFounders = new TreeSet<>(founders);
        presentFounders.retainAll(owners);
        System.out.println("Present founders: " + presentFounders);
        
        // DIFFERENCE
        Set<String> newOwners = new TreeSet<>(owners);
        newOwners.removeAll(founders);
        System.out.println("New owners: " + newOwners);
    }
}
