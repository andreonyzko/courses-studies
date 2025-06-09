import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        File path = null;
        String pathstr = "C:\\";
        do{
            path = new File(pathstr);
            File[] folders = path.listFiles(File::isDirectory);
            System.out.println(pathstr);
            for(File folder : folders) System.out.println("- " + folder.getName());

            System.out.print("\nEnter a folder path (close to exit): ");

            if(pathstr.equals("C:\\")) pathstr = pathstr.concat(read.nextLine());
            else pathstr = pathstr.concat("\\" + read.nextLine());
        }while(!pathstr.endsWith("close"));

        File[] files = path.listFiles(File::isFile);
        for(File file : files) System.out.println(file.getName());

        System.out.print("\nCreate a directory? (y/n) ");
        char createDir = read.nextLine().toLowerCase().charAt(0);
        if(createDir == 'y'){
            System.out.print("Directory name: ");
            boolean sucess = new File(path + "\\" + read.nextLine()).mkdir();
            System.out.print("Directory created: " + sucess);
        }

        read.close();
    }
}
