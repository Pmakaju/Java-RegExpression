package language.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String alphanumeric = "abcDeeeX10abcDeeijklmno";
        System.out.println(alphanumeric.replaceAll("[aei][ij]", "y"));
        System.out.println("Harry".replaceAll("[Hh]arry", "Harry"));
        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));
        String alphanumeric2 = "abcDeeeX10abcDeeijklmno98";
        System.out.println(alphanumeric2.replaceAll("[^ej10]", "S"));
        System.out.println(alphanumeric2.replaceAll("[abcdef345678]", "X"));
        System.out.println(alphanumeric2.replaceAll("[a-f3-8]", "X"));
        System.out.println(alphanumeric2.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(alphanumeric2.replaceAll("(?i)[a-f0-9]", "X"));
        System.out.println(alphanumeric2.replaceAll("(?iu)[a-f0-9]", "X"));
        System.out.println(alphanumeric2.replaceAll("[0-1]", "C"));
        System.out.println(alphanumeric2.replaceAll("\\d", "C"));
        String ourString = "This is a\t simple sentence\n";
        System.out.println(ourString);
        System.out.println(ourString.replaceAll("\\s", ""));
        System.out.println(ourString.replaceAll("\\S", ""));
        System.out.println(ourString.replaceAll("\\t", "T"));
        String alphanumeric3 = "abcDeeeX10abcDeeijklmno98_";
        System.out.println(alphanumeric3.replaceAll("[a-zA-Z0-9_]", "A"));
        String alphanumeric4 = "abcDeeeX10abcDeeijklmno98_";
        System.out.println(alphanumeric4.replaceAll("^abcDe{0,5}", "XYZ"));

        StringBuilder htmlText = new StringBuilder("<h1>Heading One</h1>");
        htmlText.append("<h2>Sub-Heading</h2>");
        htmlText.append("<p>This is a paragraph</p>");
        htmlText.append("<p>This is second paragraph</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>This is our summary</p>");

        String h2Pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();

        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println("Occurrence "+count+ ": from "+matcher.start()+ " to "+matcher.end());
        }
    }
}
