
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class TP6 {
    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);
        String word1, word2, sub;

        System.out.print("Enter the first word: ");
        word1 = s.nextLine();

        System.out.print("Enter the second word: ");
        word2 = s.nextLine();

        sub = word1.length() >= 2 ? word1.substring(word1.length() - 2) : word1;

        Pattern p = Pattern.compile("[a-zA-Z]{1,2}" + sub + "$");
        Matcher m = p.matcher(word2);

        if (m.matches()) {
            System.out.println(word2 + " rhymes with " + word1);
        } else if (word2.length() > sub.length()) {
            System.out.println("I'm not sure! Sorry!");
        } else {
            System.out.println(word2 + " does not rhyme with " + word1);
        }

        
    }
}