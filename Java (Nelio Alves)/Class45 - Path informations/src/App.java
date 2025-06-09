import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        File path = null;
        File[] files = null;
        File[] folders = null;
        String pathstr = "C:\\";
        do{
            path = new File(pathstr);
            folders = path.listFiles(File::isDirectory);
            System.out.println(pathstr);
            for(File folder : folders) System.out.println("- " + folder.getName());

            files = path.listFiles(File::isFile);
            for(File file : files) System.out.println("- "+ file.getName());

            System.out.print("\nEnter a folder path (close to exit): ");

            if(pathstr.equals("C:\\")) pathstr = pathstr.concat(read.nextLine());
            else pathstr = pathstr.concat("\\" + read.nextLine());
        }while(!pathstr.endsWith("close"));

        System.out.println("\nSelect one file: ");
        for(File file : files) System.out.println("- "+ file.getName());
        System.out.print(path.toString() + "\\");
        File file = new File(path + "\\" + read.nextLine());
        System.out.println("\nFile Data:");
        System.out.println("Name: " + file.getName());
        System.out.println("Parent: " + file.getParent());

        read.close();
    }
}
