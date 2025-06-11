package exercise.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import exercise.entities.LogEntry;

public class App {
    public static void main(String[] args) {
        String path = "src\\exercise\\file.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> logEntries = new HashSet<>();
            String line = br.readLine();

            while(line != null){
                String fields[] = line.split(",");
                logEntries.add(new LogEntry(fields[0], Instant.parse(fields[1])));
                line = br.readLine();
            }

            System.out.println("Total users: " + logEntries.size());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }   
}
