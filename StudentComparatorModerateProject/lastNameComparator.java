//lastNameComparator compares the last names of two students, it takes into account every character in a last name, not just the first char
//sorting in ascendign order a-z
package StudentComparatorModerateProject;

import java.util.*;

public class lastNameComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        // set the first character first
        char lastName1 = student1.getLastName().charAt(0);
        char lastName2 = student2.getLastName().charAt(0);
        int index = 1;

        // loop until find a different character to return
        // this will make sure to check every character in case they have the same last
        // name
        // the second and third conditions make sure the index didn't go exceed the
        // length
        while (lastName1 == lastName2 && index < student1.getLastName().length()
                && index < student2.getLastName().length()) {
            lastName1 = student1.getLastName().charAt(index);
            lastName2 = student2.getLastName().charAt(index);
            index++;
        }

        // if/else statement is for the case like lastName1=abc and lastName2 = abcd or
        // vice versa
        if (index == student1.getLastName().length() - 1 && index < student2.getLastName().length() - 1)
            return -1;
        else if (index == student2.getLastName().length() - 1 && index < student1.getLastName().length() - 1)
            return 1;

        return lastName1 - lastName2;
    }
}
