package lab5;

import java.util.regex.*;

public class NumberFinder{
    public static void main(String[] args){
        String text = "The price of the product is $19.99";
        Pattern pattern = Pattern.compile("\\d+.\\d+|\\d+");
        Matcher matcher = pattern.matcher(text);
        boolean finder = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            finder = true; // Set the flag to true if a match is found
        }
        if (!finder) {
            System.out.println("Number not found");
        }
    }
}
