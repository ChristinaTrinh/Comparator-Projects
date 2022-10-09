//This is the Student class
//Each new created instance represents one student
package StudentComparatorModerateProject;

public class Student {
    private String lastName;
    private String firstName;
    private String idNum;
    private double average;
    private char letterGrade;

    public Student() {
        this("", "", "", 0.0, ' ');
    }

    public Student(String lastName, String firstName, String idNum, double average, char letterGrade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.idNum = idNum;
        this.average = average;
        this.letterGrade = letterGrade;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getIdNum() {
        return this.idNum;
    }

    public double getAverage() {
        return this.average;
    }

    public char getLetterGrade() {
        return this.letterGrade;
    }

    public String toString() {
        return lastName + " " + firstName + " " + idNum + " " + average + " " + letterGrade;
    }
}