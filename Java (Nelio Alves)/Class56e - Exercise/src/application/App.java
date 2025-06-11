package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String path = "src\\file.csv";
        Map<String, Integer> candidates = new LinkedHashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while(line != null){
                String fields[] = line.split(",");
                if(candidates.containsKey(fields[0])){
                    candidates.put(fields[0], candidates.get(fields[0])+Integer.parseInt(fields[1]));
                }
                else{
                    candidates.put(fields[0], Integer.parseInt(fields[1]));
                }
                line = br.readLine();
            }

            for(String candidate : candidates.keySet()){
                System.out.print(candidate + ": " + candidates.get(candidate));
                System.out.println();
            }
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
