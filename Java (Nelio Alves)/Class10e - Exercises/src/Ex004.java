import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter N value: ");
        int n = read.nextInt();

        for(int i=0; i<n; i++){
            System.out.printf("\nEnter two values to division: ");
            double div1 = read.nextDouble(), div2 = read.nextDouble(), result;

            if(div2 == 0){
                System.out.printf("Impossible division\n");
                continue;
            }

            result = div1 / div2;
            System.out.println(result);
        }

        read.close();
    }
}
