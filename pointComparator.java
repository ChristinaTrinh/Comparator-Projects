
//This Comparator compares Point objects by their distance from the origin of (0,0)
//Points that are closer to the origin are considered to come before those which 
//are further from the origin
import java.util.*;
import java.awt.*;

public class pointComparator implements Comparator<Point> {
    public int compare(Point p1, Point p2) {
        double result = Math.sqrt(Math.pow(p1.getX(), 2) + Math.pow(p1.getY(), 2))
                - Math.sqrt(Math.pow(p2.getX(), 2) + Math.pow(p2.getY(), 2));
        if (result < 0)
            return -1;
        else if (result > 0)
            return 1;
        else
            return 0;
    }
}