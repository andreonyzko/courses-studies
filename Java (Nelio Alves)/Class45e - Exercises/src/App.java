import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("source.csv"))){

            String line = br.readLine();
            while(line != null){
                String data[] = line.split(",");
                String name = data[0];
                double price = Double.parseDouble(data[1]);
                int amount = Integer.parseInt(data[2]);
                products.add(new Product(name, price, amount));
                line = br.readLine();

            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter("out\\output.csv"))){
                for(Product product : products){
                    bw.write(product.getName() + "," + product.getTotalPrice());
                    bw.newLine();
                }
            }
            catch(IOException e){
                System.out.println("Error: couldn't open writing file");
            }
        } 
        catch(IOException e){
            System.out.print("Error: couldn't open reading file");
        }
    }
}
