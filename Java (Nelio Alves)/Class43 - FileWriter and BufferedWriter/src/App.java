import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter some names: ");
        String names[] = read.nextLine().trim().split(" ");

        String path = "C:\\Users\\andre\\OneDrive\\Documentos\\dev\\courses-studies\\Java (Nelio Alves)\\Class43 - FileWriter and BufferedWriter\\file.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String name : names){
                bw.write(name);
                bw.newLine();
            };
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        read.close();
    }
}
