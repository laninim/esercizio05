package it.develhope.exercise5;

public class Professor extends CollegePerson implements IteachingPerson {

    public String teachingSubject;

    public Professor(String name, String surname, int collegeID, String teachingSubject){
        super(name,surname,collegeID);
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("The professor start teach student's");
    }
}
