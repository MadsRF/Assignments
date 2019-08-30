public class Employee extends Person {

    protected int hours;
    protected int salary;
    protected int vacation;

    public Employee(String firstName, String CPR) {
        super(firstName, CPR);
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }

    public int getVacation() {
        return vacation;
    }
}
