
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class TP6 {
    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = s.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = s.nextLine();

        String sub = word1.length() >= 2
                ? word1.substring(word1.length() - 2)
                : word1;

        Pattern p = Pattern.compile("([a-zA-Z]{1,2})" + sub + "$");
        Matcher m = p.matcher(word2);
        if (m.matches()) {
            if (m.group(1).length() == 2) {
                System.out.println(word2 + " rhymes with " + word1);
            } else {
                System.out.println(word2 + " does not rhyme with " + word1);
            }
        } else if (word2.endsWith(sub)) {
            System.out.println("I'm not sure! Sorry!");
        } else {
            System.out.println(word2 + " does not rhyme with " + word1);
        }

    }
}
