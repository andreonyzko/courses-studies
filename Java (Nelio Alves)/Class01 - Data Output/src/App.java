public class App {
    public static void main(String[] args) {
        // System.out.print("Hello World! \n");
        // System.out.println("Hello, World!");
        // System.out.printf("%s \n", "Hello World!");
        
        // %d -> int;
        // %f -> float, double;
        // %c -> char;
        // %s -> string;
        // \n -> new line;
        
        int a = 32;
        System.out.println(a);
        
        double b = 10.35784;
        System.out.println(b);
        System.out.printf("%.2f\n", b);
        System.out.println("RESULT = " + b + "meters");
        System.out.printf("RESULT = %.2f meters \n", b);
        
        String name = "André";
        int age = 20;
        double income = 500.00;
        System.out.printf("%s's %d yers old and he has $%.2f", name, age, income);
        
        //----------------------------------------------------------------------
        // Challenge
        //----------------------------------------------------------------------
        String product1 = "Computer";
        String product2 = "Office desk";
        
        age = 30;
        int code = 5290;
        char gender = 'M';  
        
        double price1 = 2100.00;
        double price2 = 650.00;
        double measure = 53.234567;
        
        System.out.println("Products:");
        System.out.printf("%s, wich price is $%.2f\n", product1, price1);
        System.out.printf("%s, wich price is $%.2f\n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender %c\n", age, code, gender);
        System.out.println();
        System.out.println("Measure with eight decimal places = " + measure);
        System.out.printf("Rounded = %.3f\n", measure);
    }
}
