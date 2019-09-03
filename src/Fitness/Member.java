package Fitness;

public class Member extends Person {


    public Member(String firstName, String CPR) {
        super(firstName, CPR);
    }

    public String getMemberType() {
        return "basic";
    }

    public int getFee() {
        return 199;
    }

    @Override
    public String toString() {
        return String.format("%-10S %-20S %-10S %10S",firstName,CPR,getMemberType(),getFee());

    }

}
