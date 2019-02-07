package com.yankovich;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);
        System.out.println("==============");

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        Function<Employee, String> getLastName = (Employee employee) -> employee.getName().substring(employee.getName().indexOf(' ') + 1);

        //String lastName = getLastName.apply(employees.get(1));

        Function<Employee, String> getFirstName = (Employee employee) -> employee.getName().substring(0, employee.getName().indexOf(' '));

        Random random = new Random();
        for (Employee employee : employees) {
            if (random.nextBoolean()) {
                System.out.println(getAName(getFirstName, employee));
            } else {
                System.out.println(getAName(getLastName, employee));
            }
        }


        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> firstName = name -> name.substring(0, name.indexOf(' '));
        Function<Employee, String> chainedFunction = upperCase.andThen(firstName);
        System.out.println("================");
        System.out.println(chainedFunction.apply(employees.get(0)));

        // Represents a function that accepts two arguments and produces a result.
        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> name.concat(" " + employee.getAge());
        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName, employees.get(0)));

        IntUnaryOperator incBy5 = i -> i + 5;
        System.out.println(incBy5.applyAsInt(10));

        Consumer<String> c1 = s -> {
            s = s.toUpperCase();
            System.out.println(s);
        };
        Consumer<String> c2 = s -> System.out.println(s);
        c1.andThen(c2).accept("Hello, World!");



    }

    private static String getAName(Function<Employee, String> getName, Employee employee) {
        return getName.apply(employee);
    }

//    private static void printEmployeesByAge(List<Employee> employees,
//                                            String ageText,
//                                            Predicate<Employee> ageCondition) {
//
//        System.out.println(ageText);
//        System.out.println("==================");
//        for (Employee employee : employees) {
//            if (ageCondition.test(employee)) {
//                System.out.println(employee.getName());
//            }
//        }
//    }

    static class Employee {
        private String name;
        private int age;

        Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }

    }
}


