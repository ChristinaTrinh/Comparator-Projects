//letterGradeComparator compares the letter grade of two students sorting in ascending order A-Z
package StudentComparatorModerateProject;

import java.util.*;

public class letterGradeComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        return student1.getLetterGrade() - student2.getLetterGrade();
    }
}