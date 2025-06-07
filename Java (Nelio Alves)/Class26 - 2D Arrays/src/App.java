import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter matrix order: ");
        int order = read.nextInt();
        int array[][] = new int[order][order];

        for(int i=0; i<order ; i++){
            for(int j=0; j<order; j++){
                System.out.printf("[%d,%d]: ", i, j);
                array[i][j] = read.nextInt();
            }
        }

        System.out.println("\n2D ARRAY: ");
        for(int i=0; i<order ; i++){
            for(int j=0; j<order; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nMain diagonal: ");
        for(int i=0; i<order ; i++){
            System.out.print(array[i][i] + " ");
        }

        System.out.print("\nNegative numbers: ");
        for(int i=0; i<order ; i++){
            for(int j=0; j<order; j++){
                if(array[i][j] < 0) System.out.print(array[i][j] + " ");
            }
        }

        read.close();
    }
}
