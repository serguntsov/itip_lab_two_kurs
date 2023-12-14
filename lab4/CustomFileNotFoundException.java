package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;

public class CustomFileNotFoundException {
    private static Logger log = Logger.getLogger(CustomFileNotFoundException.class.getName());
    public static void main(String[] args) {
        String line = "";
        File file = new File("/Users/serguntsov/desktop/java/lab/src/lab4/parsein1.txt");
        try{
            FileHandler fileHandler = new FileHandler("/Users/serguntsov/desktop/java/lab/src/lab4/log.txt", true);
            log.setLevel(Level.INFO);
            fileHandler.setFormatter(new SimpleFormatter());
            log.addHandler(fileHandler);
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
            log.log(Level.SEVERE, "File Not Found", e);
        } catch (java.lang.NumberFormatException e){
            log.log(Level.SEVERE, "Number Format Error: " + Arrays.toString(line.split(" ")), e);
        } catch (IOException e) {
            log.log(Level.SEVERE, "Write error", e);
        }
    }
}