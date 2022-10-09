
//This Comparator compares String objects of a particular format
//Each string is of a form such as "123456 Seattle, WA", beginning with a numeric token
//that is followed by additional text tokents.
//This Comparator treats the first tokents as integers and compare them in numerical order
//For example: "276453 Helena, MT" is greater than "9847 New York, NY".
import java.util.*;

public class stringParticularFormatComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        String integer1 = "";
        String integer2 = "";
        Scanner scan = new Scanner(s1);
        if (scan.hasNext())
            integer1 = scan.next();
        scan = new Scanner(s2);
        if (scan.hasNext())
            integer2 = scan.next();
        int converted1 = Integer.valueOf(integer1);
        int converted2 = Integer.valueOf(integer2);
        return converted1 - converted2;
    }
}