package Fitness;

public abstract class Person {

    protected String firstName;
    protected String CPR;

    public Person(String firstName, String CPR) {
        this.firstName = firstName;
        this.CPR = CPR;
    }

    public String getCPR() {
        return CPR;
    }
}
