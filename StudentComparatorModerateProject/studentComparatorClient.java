//This is the client of the the students comparator project
//It creates 5 students and sort them in prefered order 
//Either by first name, last name, ID Num, average grade, or letter grade of the students
package StudentComparatorModerateProject;

import java.util.*;

public class studentComparatorClient {
    public static void main() {
        Student students[] = { new Student("Smith", "Kelly", "438975", 98.6, 'A'),
                new Student("Johnson", "Gus", "210498", 72.4, 'C'),
                new Student("Reges", "Stu", "098736", 88.2, 'B'),
                new Student("Smith", "Marty", "346282", 84.1, 'B'),
                new Student("Reges", "Abe", "298575", 78.3, 'C') };

        System.out.println("Programming Project Chapter 13 #3:");
        System.out.println("================================= \n");
        System.out.println("Student: LastName FirstName ID AVG Grade \n");

        System.out.println("---students list originally---");
        System.out.print("[");
        for (int i = 0; i < students.length - 1; i++)
            System.out.println(students[i] + ", ");
        System.out.println(students[students.length - 1] + "]");
        System.out.println();

        System.out.println("---students list sort by LastName---");
        Arrays.sort(students, new lastNameComparator());
        System.out.print("[");
        for (int i = 0; i < students.length - 1; i++)
            System.out.println(students[i] + ", ");
        System.out.println(students[students.length - 1] + "]");
        System.out.println();

        System.out.println("---students list sort by FirstName---");
        Arrays.sort(students, new firstNameComparator());
        System.out.print("[");
        for (int i = 0; i < students.length - 1; i++)
            System.out.println(students[i] + ", ");
        System.out.println(students[students.length - 1] + "]");
        System.out.println();

        System.out.println("---Students list by idNum---");
        Arrays.sort(students, new idNumComparator());
        System.out.print("[");
        for (int i = 0; i < students.length - 1; i++)
            System.out.println(students[i] + ", ");
        System.out.println(students[students.length - 1] + "]");
        System.out.println();

        System.out.println("---Students list by Average---");
        Arrays.sort(students, new averageComparator());
        System.out.print("[");
        for (int i = 0; i < students.length - 1; i++)
            System.out.println(students[i] + ", ");
        System.out.println(students[students.length - 1] + "]");
        System.out.println();

        System.out.println("---Students list by LetterGrade---");
        Arrays.sort(students, new letterGradeComparator());
        System.out.print("[");
        for (int i = 0; i < students.length - 1; i++)
            System.out.println(students[i] + ", ");
        System.out.println(students[students.length - 1] + "]");
        System.out.println();
    }
}
