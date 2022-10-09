//averageComparator compares the average of two students
//sorting in ascending order 0-100
package StudentComparatorModerateProject;

import java.util.*;

public class averageComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        double difference = student1.getAverage() - student2.getAverage();
        if (difference < 0)
            return -1;
        else if (difference > 0)
            return 1;
        else
            return 0;
    }
}