
//This Comparator compares String objects by the number of words they contain.
//Consider any nonwhitespace string of characters to be a word.
//For example: "hello" comes before "I see", which comes before "You can do it"
import java.util.*;

public class numberOfWordsComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        int word1 = 0;
        int word2 = 0;
        Scanner scan = new Scanner(s1);
        while (scan.hasNext())
            word1++;
        scan = new Scanner(s2);
        while (scan.hasNext())
            word2++;
        return word1 - word2;
    }
}