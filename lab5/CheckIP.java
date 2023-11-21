package lab5;

import java.util.regex.*;

public class CheckIP{
    public static void main(String[] args){
        String ip = "55.2.0.1";
        Pattern pattern = Pattern.compile("(([25][0-5]|[2][0-4][0-9]|[1]?[0-9]?[0-9])(\\.(?!$)|$)){4}");
        Matcher matcher = pattern.matcher(ip);
        if (matcher.matches()) {
            System.out.println("Success");
        } else {
            System.out.println("IP incorrect");
        }
    }
}