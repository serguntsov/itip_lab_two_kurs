package lab4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CopyPaste {
    public static void main(String[] args) {
        File file = new File("/Users/serguntsov/desktop/java/lab/src/lab4/copy.txt");
        try{
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e){
            System.out.println("File Not Founded");
        } catch (java.lang.IllegalStateException e){
            System.out.println("Reading error");
        }
    }
}
