package Fitness;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new AdminPersonnel("Claus", "221175-1011"));
        personList.add(new Instructor("Tove", "011080-1014", 20));
        personList.add(new AdminPersonnel("anna", "011080-1012"));
        personList.add(new Instructor("Henning", "011080-1014", 15));
        personList.add(new MemberPlus("Morten", "130195-1303"));
        personList.add(new Member("Martin", "221175-1011"));
        personList.add(new MemberPlus("Martina", "050970-1409"));
        personList.add(new Member("Marcel", "221175-1011"));

        if (personList.size() == 0) {
            System.out.println("No people on the list\n\n");
        }
        if (personList.size() > 1) {
            printEmployee();
            for (Person p : personList) {
                if (p instanceof Employee) {
                    System.out.println(p.toString());
                }
            }
            System.out.println("\n=====================================================\n\n");

            printMember();
            for (Person p1 : personList) {
                if (p1 instanceof Member) {
                    System.out.println(p1.toString());
                }
            }
            System.out.println("\n=====================================================\n\n");

            printAll();
            for (Person p2 : personList) {
                System.out.format("%-10S %-20S\n", p2.firstName, p2.CPR);
            }
            System.out.println("\n=====================================================\n\n");
        }
    }

    private static void printEmployee(){
        System.out.println("FITNESS EMPLOYEES");
        System.out.format("%-10S %-20S %-10S %-10S %S\n","Name","Cpr","Hours","salary","vacation");
        System.out.println("**************************************************************");
    }

    private static void printMember(){
        System.out.println("FITNESS MEMBERS");
        System.out.format("%-10S %-20S %-10S %10S\n","Name","Cpr","membertype","Fee");
        System.out.println("**************************************************************");
    }

    private static void printAll(){
        System.out.println("EMPLOYEES & FITNESS MEMBERS Name and cpr");
        System.out.format("%-10S %-20S\n","Name","Cpr");
        System.out.println("**************************************************************");
    }
}
