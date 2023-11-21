package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CustomFileNotFoundException {
    public static void main(String[] args) {
        String line = "";
        File file = new File("/Users/serguntsov/desktop/java/lab/src/lab4/parseint.txt");
        File filenew = new File("/Users/serguntsov/desktop/java/lab/src/lab4/log.txt");
        try{
            filenew.createNewFile();
            FileWriter writer = new FileWriter("/Users/serguntsov/desktop/java/lab/src/lab4/paste.txt");
            Scanner scan = new Scanner(file);
            line = scan.nextLine().replaceAll("\\pP", "");
            scan.close();
            String[] nums = line.toLowerCase().split(" ");
            int[] num = new int[nums.length];
            int count = 0;
            for (String a : nums){
                num[count++] = Integer.parseInt(a);
            }
            System.out.println(Arrays.toString(num));
        } catch (FileNotFoundException e){
            writer.write(line);
            System.out.println("File Not Founded");
        } catch (java.lang.NumberFormatException e){
            System.out.println("Number Format Error: " + Arrays.toString(line.split(" ")));
        } catch (IOException e) {
            System.out.println("Write error");
        }
    }
}
