package lab4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyPaste {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/serguntsov/desktop/java/lab/src/lab4/copy.txt");
        File filenew = new File("/Users/serguntsov/desktop/java/lab/src/lab4/paste.txt");
        try{
            filenew.createNewFile();
            Scanner scan = new Scanner(file);
            FileWriter writer = new FileWriter("/Users/serguntsov/desktop/java/lab/src/lab4/paste.txt");
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                writer.write(line);
                System.out.println(line);
            }
            scan.close();
            writer.close();
        } catch (FileNotFoundException e){
            System.out.println("File Not Founded");
        } catch (java.lang.IllegalStateException e){
            System.out.println("Reading error");
        } catch (IOException e){
            System.out.println("Write error");
        }
    }
}
