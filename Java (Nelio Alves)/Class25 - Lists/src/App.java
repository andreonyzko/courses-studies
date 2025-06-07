import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
                Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>(); // Declaração
        
        // Adições
        list.add("Andre");
        list.add("Kadu");
        list.add("Lucas");
        list.add("Kaii");
        list.add("Andrey");
        list.add("Lari");
        list.add(1, "Samuel");
        list.add(2, "Eduardo");
        list.add(3, "Diogo");
        
        System.out.println("=-=-=-=-=- UBER'S BAR -=-=-=-=-=-=");
        System.out.println("Membros: " + list.size());
        for(String obj : list) System.out.println("- " + obj);

        // Remoções
        list.remove("Samuel");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'D');
        
        System.out.println("=-=-=-=-=- UBER'S BAR -=-=-=-=-=-=");
        System.out.println("Membros: " + list.size());
        for(String obj : list) System.out.println("- " + obj);
        
        // Buscas
        System.out.println("=-=-=-=-=- FOUNDERS -=-=-=-=-=-=");
        System.out.printf("%d - Andre\n", (int)list.indexOf("Andre"));
        System.out.printf("%d - Kadu\n", (int)list.indexOf("Kadu"));
        System.out.printf("%s - Jose\n", (int)list.indexOf("Jose") < 0 ? "BANED" : (char)list.indexOf("Jose"));
        
        // Filtragem
        System.out.println("=-=-=-=-=- UBER'S BAR -=-=-=-=-=-=");
        System.out.print("Enter the first member's names letter to filter: ");
        char letter = sc.next().charAt(0);
        List<String> result = list.stream().filter(x -> x.charAt(0) == letter).collect(Collectors.toList());
        for(String obj : result) System.out.println("- " + obj);
        
        System.out.println("=-=-=-=-=- UBER'S BAR -=-=-=-=-=-=");
        String result2 = list.stream().filter(x -> x.charAt(0) == 'H').findFirst().orElse(null);
        System.out.println(result2);

        sc.close();
    }
}
