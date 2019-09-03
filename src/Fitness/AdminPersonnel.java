package Fitness;

public class AdminPersonnel extends Employee {


    public AdminPersonnel(String firstName, String CPR) {
        super(firstName, CPR);
    }

    @Override
    public int getHours() {
        return hours + 37;
    }

    @Override
    public int getSalary() {
        return salary + 33000;
    }

    @Override
    public int getVacation() {
        return vacation + 5;
    }

    @Override
    public String toString() {
        return String.format("%-10S %-20S %-10S %-10S %S", firstName,CPR,getHours(),getSalary(),getVacation());
    }
}
