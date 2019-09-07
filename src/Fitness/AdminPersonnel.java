package Fitness;

public class AdminPersonnel extends Employee {

    private Vehicle car = new Vehicle();
    private int dateOfHiring;


    public AdminPersonnel(String firstName, String CPR, int dateOfHiring) {
        super(firstName, CPR);
        this.dateOfHiring = dateOfHiring;
    }

    public int getDateOfHiring(){
        return dateOfHiring;
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

        if(getDateOfHiring() == 1){
            return String.format("%-10S %-20S %-10S %-10S %-10S %S", firstName, CPR, getHours(), getSalary(), getVacation(), car.getCar());

        }else {
            return String.format("%-10S %-20S %-10S %-10S %S", firstName, CPR, getHours(), getSalary(), getVacation());
        }
    }
}
