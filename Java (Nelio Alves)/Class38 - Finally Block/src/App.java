import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\andre\\OneDrive\\Documentos\\dev\\courses-studies\\Java (Nelio Alves)\\Class38 - Finally Block\\file.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()) System.out.println(sc.nextLine());
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening file");
        }
        finally{
            if(sc != null) sc.close();
        }
        
    }
}
