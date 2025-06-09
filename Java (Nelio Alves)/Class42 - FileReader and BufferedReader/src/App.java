import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\andre\\OneDrive\\Documentos\\dev\\courses-studies\\Java (Nelio Alves)\\Class42 - FileReader and BufferedReader\\file.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
               System.out.println(line);
               line = br.readLine(); 
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
