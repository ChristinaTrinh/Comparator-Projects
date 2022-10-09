//firstNameComparator compares the first names of two students, it takes into account every character in a first name, not just the first char
//sorting in ascendign order a-z
package StudentComparatorModerateProject;

import java.util.*;

public class firstNameComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        // set the first character first
        char firstName1 = student1.getFirstName().charAt(0);
        char firstName2 = student2.getFirstName().charAt(0);
        int index = 1;

        // loop until find a different character to return
        // this will make sure to check every character in case they have the same first
        // name
        // the second and third conditions make sure the index didn't go exceed the
        // length
        while (firstName1 == firstName2 && index < student1.getFirstName().length()
                && index < student2.getFirstName().length()) {
            firstName1 = student1.getFirstName().charAt(index);
            firstName2 = student2.getFirstName().charAt(index);
            index++;
        }

        // if/else statement is for the case like firstName1=abc and firstName2 = abcd
        // or vice versa
        if (index == student1.getFirstName().length() - 1 && index < student2.getFirstName().length() - 1)
            return -1;
        else if (index == student2.getFirstName().length() - 1 && index < student1.getFirstName().length() - 1)
            return 1;

        return firstName1 - firstName2;
    }
}
