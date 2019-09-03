package Fitness;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Instructor in = new Instructor("Tove","011080-1014",20);
        Instructor in1 = new Instructor("Henning","011080-1014",15);
        AdminPersonnel admin = new AdminPersonnel("Claus","221175-1011");
        AdminPersonnel admin1 = new AdminPersonnel("anna","011080-1012");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(admin);
        employeeList.add(in);
        employeeList.add(admin1);
        employeeList.add(in1);

        printEmployee();
        for (Employee e: employeeList){
            System.out.println(e.toString());
        }
        System.out.println("\n=====================================================\n\n");
        Thread.sleep(1000);

        Member m = new Member("Martin","221175-1011");
        Member m2 = new Member("Marcel","221175-1011");
        MemberPlus mP = new MemberPlus("Morten", "130195-1303");
        MemberPlus mP1 = new MemberPlus("Martina", "050970-1409");

        List<Member> MemberList = new ArrayList<>();
        MemberList.add(mP);
        MemberList.add(m);
        MemberList.add(mP1);
        MemberList.add(m2);

        printMember();
        for (Member men : MemberList){
            System.out.println(men.toString());
        }
        System.out.println("\n=====================================================\n\n");
        Thread.sleep(1000);

        List<Person> personList = new ArrayList<>();
        personList.addAll(MemberList);
        personList.addAll(employeeList);

        printAll();
        for (Person p : personList){
            System.out.format("%-10S %-20S\n",p.firstName,p.CPR);


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
