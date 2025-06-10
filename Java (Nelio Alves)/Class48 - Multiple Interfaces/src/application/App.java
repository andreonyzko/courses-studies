package application;

import entities.ComboDevice;
import entities.Document;

public class App {
    public static void main(String[] args) {
        ComboDevice comboDevice = new ComboDevice("12345");
        Document doc = new Document();

        comboDevice.processDoc(doc);
    }
}
