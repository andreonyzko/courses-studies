package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Emplooye;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        List<Emplooye> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("src\\file.csv"))) {
            String employeeCsv = br.readLine();

            while(employeeCsv != null){
                String fields[] = employeeCsv.split(",");
                list.add(new Emplooye(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }

            Collections.sort(list);

            for(Emplooye emplooye : list){
                System.out.println(emplooye);
            }
        } 
        catch (IOException e) {
            System.out.println("Error with open file");
        }
    }
}
