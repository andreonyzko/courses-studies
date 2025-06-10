package entities;

public class ComboDevice extends Device implements Printer, Scanner{
    static java.util.Scanner read = new java.util.Scanner(System.in);

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }
 
    @Override
    public void processDoc(Document doc) {
        System.out.println(scan(doc));
        print(doc);
    }
    
    @Override
    public void print(Document doc) {
        System.out.println(doc.getText());
    }

    @Override
    public String scan(Document doc) {
        doc.setText(read.nextLine());
        read.close();
        return "Document Scanned";
    }
}
