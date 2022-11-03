package it.develhope.exercise5;

public class Testing {

    public static void main(String[] args) {

            Student stud1 = new Student("Mauro","Lanini",02, 2022);
            Assistant ass1 = new Assistant("Buddy","buddy", 03, true);
            Professor prof1 = new Professor("Luca","Rossi",05,"Java");

            stud1.goToCollege();
            ass1.goToCollege();
            prof1.goToCollege();

            stud1.studyAtHome();
            prof1.teachToOtherPeople();
            ass1.studyAtHome();
            ass1.teachToOtherPeople();
    }
}
