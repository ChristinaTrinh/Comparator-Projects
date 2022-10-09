//idNumComparator compare the ID number of two students
package StudentComparatorModerateProject;

import java.util.*;

public class idNumComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        // convert the string ids to integer first to compare
        int idStudent1 = Integer.valueOf(student1.getIdNum());
        int idStudent2 = Integer.valueOf(student2.getIdNum());
        return idStudent1 - idStudent2;
    }
}
