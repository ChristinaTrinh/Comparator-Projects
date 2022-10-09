//LastCharacterOrderComparator: "compares" the last letter of 2 Strings.
package BasicStringComparator;

import java.util.*;

public class lastCharacterOrderComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1);
    }
}