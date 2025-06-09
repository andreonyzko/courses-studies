import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File path = new File("C:\\Users\\andre\\OneDrive\\Documentos\\dev\\courses-studies\\Java (Nelio Alves)\\Class40 - Files\\file.txt");
        Scanner readFile = null;

        try{
            readFile = new Scanner(path);
            while(readFile.hasNextLine()) System.out.println(readFile.nextLine());
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            if(readFile != null) readFile.close();
        }
    }
}
