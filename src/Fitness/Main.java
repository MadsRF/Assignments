package Fitness;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();


        personList.add(new AdminPersonnel("Claus", "221175-1011",1));
        personList.add(new Instructor("Tove", "011080-1014", 20));
        personList.add(new AdminPersonnel("anna", "011080-1012",1));
        personList.add(new Instructor("Henning", "011080-1014", 15));
        personList.add(new MemberPlus("Morten", "130195-1303"));
        personList.add(new Member("Martin", "221175-1011"));
        personList.add(new MemberPlus("Martina", "050970-1409"));
        personList.add(new Member("Marcel", "221175-1011"));

        //test UNDER 16
        personList.add(new Member("Mads", "221110-1011"));

        for (int i = 0; i <= personList.size(); i++) {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String date = formatter.format(new Date());

            String temp = personList.get(0).getCPR();
            int year = Integer.parseInt((temp.substring(4, 6)));
            if (year < 20) {
                year += 2000;
            } else {
                year += 1900;
            }

            int month = Integer.parseInt(temp.substring(2, 4));
            int day = Integer.parseInt(temp.substring(0, 2));

            String birthday = year + "-" + month + "-" + day;

            LocalDate date1 = LocalDate.parse(birthday);
            LocalDate date2 = LocalDate.parse(date);

            long age = date1.until(date2, ChronoUnit.YEARS);

            System.out.println(age);
        }

        if (personList.size() == 0) {
            System.out.println("No people on the list\n\n");
        }
        else if (personList.size() > 1) {
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
