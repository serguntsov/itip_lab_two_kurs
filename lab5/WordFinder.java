package lab5;


import java.util.regex.*;

public class WordFinder{
    public static void main(String[] args){
        String text = "The side bar includes a Cheatsheet, full Reference, and Help." +
        "You can also Save & Share with the Community and view patterns you create or favorite in My Patterns."+
        "Explore results with the Tools below. Replace & List output custom results."+
        "Details lists capture groups. Explain describes your expression in plain English.";
        Pattern pattern = Pattern.compile("\\ba[A-Za-z]*\\b");
        Matcher matcher = pattern.matcher(text);
        boolean finder = false;
        while (matcher.find()){
            System.out.println(matcher.group());
            finder = true; // Set the flag to true if a match is found
        }
        if (!finder) {
            System.out.println("Word not found");
        }
        
    }
}
