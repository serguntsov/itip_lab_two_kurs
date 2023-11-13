package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CustomFileNotFoundException {
    public static void main(String[] args) {
        String line = "";
        File file = new File("/Users/serguntsov/desktop/java/lab/src/lab4/parseint.txt");
        try{
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
            System.out.println("File Not Founded");
        } catch (java.lang.NumberFormatException e){
            System.out.println("Number Format Error: " + Arrays.toString(line.split(" ")));
        }
    }
}
