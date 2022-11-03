package it.develhope.exercise5;

public class Assistant extends CollegePerson implements IteachingPerson,IlearningPerson{

    public boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeID, boolean isGoingToBeAPhD) {
        super(name, surname, collegeID);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Assistant " + this.name + "study at home");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Assistant " + this.name + "start a lesson now!");
    }
}
