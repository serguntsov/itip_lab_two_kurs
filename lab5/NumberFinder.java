package lab5;

import java.util.regex.*;

public class NumberFinder{
    public static void main(String[] args){
        String text = "The price of the product -1 is $19.99";
        Pattern pattern = Pattern.compile("-?(\\d+.\\d+|\\d+)");
        Matcher matcher = pattern.matcher(text);
        boolean finder = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            finder = true;
        }
        if (!finder) {
            System.out.println("Number not found");
        }
    }
}
