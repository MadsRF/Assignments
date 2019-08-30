public class Instructor extends Employee {


    public Instructor(String firstName, String CPR, int hours) {
        super(firstName, CPR);
        this.hours = hours;
    }

    @Override
    public int getHours() {
        return hours;
    }

    @Override
    public int getSalary() {
        return salary = 199 * getHours();
    }


    @Override
    public String toString() {
        return String.format("%-10S %-20S %-10S %-10S", firstName,CPR,getHours(),getSalary());
    }
}

