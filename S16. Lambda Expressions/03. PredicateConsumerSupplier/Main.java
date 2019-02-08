package com.yankovich;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("john m", 30);
        Employee tim = new Employee("tim b", 21);
        Employee jack = new Employee("jack c", 40);
        Employee snow = new Employee("snow d", 22);
        Employee red = new Employee("Red e", 35);
        Employee charming = new Employee("Prince f", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        // predicate - returns true or false
        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "\nEmployees 30 and under", employee -> employee.getAge() <= 30);
//        printEmployeesByAge(employees, "\nEmployees younger 25", new Predicate<Employee>() {
//            @Override
//            public boolean test(Employee employee) {
//                return employee.getAge() < 25;
//            }
//        });

        System.out.println("\n");

        // predicate
        IntPredicate greaterThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i < 100;

        System.out.println(greaterThan15.test(10));
        int a = 20;
        System.out.println(greaterThan15.test(a + 5));

        System.out.println(greaterThan15.and(lessThan100).test(50)); // true
        System.out.println(greaterThan15.and(lessThan100).test(15)); // false
        System.out.println("\n");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(1000) + " "); // 0 - 999
        }
        System.out.println("\n");

        // supplier
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        for (int i = 0; i < 10; i++) {
            System.out.print(randomSupplier.get() + " ");
        }
        // consumer
        employees.forEach(employee -> {
            String lastName = employee.getName().substring(employee.getName().indexOf(' ') + 1);
            System.out.println("\nLast name is: " + lastName);
        });

//        employees.forEach(employee -> {
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//        });

    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        System.out.println("==================");
        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
}
