package it.develhope.exercise5;

public class Student extends CollegePerson implements IlearningPerson{

    public int academyYear;

    public Student(String name, String surname, int collegeID, int academyYear) {
        super(name, surname, collegeID);
        this.academyYear = academyYear;
    }

    @Override
    public void studyAtHome() {
        System.out.println("The student " + this.name + " study at home now!");
    }
}
