//LastCharacterOrderComparator: "compares" the first letter of 2 Strings.
package BasicStringComparator;

import java.util.*;

public class firstCharacterOrderComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s1.charAt(0) - s2.charAt(0);
    }
}
