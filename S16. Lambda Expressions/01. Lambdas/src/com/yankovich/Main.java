package com.yankovich;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        new Thread(() -> {
//            System.out.println("Line1");
//            System.out.println("Line2");
//        }).start();

        Employee john = new Employee("john", 30);
        Employee tim = new Employee("tim", 32);
        Employee jack = new Employee("jack", 54);
        Employee snow = new Employee("snow", 21);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

        employees.forEach();
////        Collections.sort(employees, new Comparator<Employee>() {
////            @Override
////            public int compare(Employee employee1, Employee employee2) {
////                return employee1.getName().compareTo(employee2.getName());
////            }
////        });
//
////        Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));
//
//        Collections.sort(employees, Comparator.comparing(Employee::getName));
//
//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//        }
//
////        String sillyString = doStringStuff(new UpperConcat() {
////            @Override
////            public String upperAndConcat(String s1, String s2) {
////                return s1.toUpperCase() + s2.toUpperCase();
////            }
////        }, employees.get(0).getName(), employees.get(1).getName());
//        String sillyString = doStringStuff((s1, s2) -> s1.toUpperCase() + s2.toUpperCase(), employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);
        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}
// lambda - nested block of code
class AnotherClass {
    public String doSomething() {
        int i = 0;
        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
        return Main.doStringStuff((s1, s2) -> {
            System.out.println("The lambda expression's class is: " + getClass().getSimpleName());
            System.out.println("i in the lambda = " + i);
            return s1.toUpperCase() + s2.toUpperCase();
            },"String1","String2");
    }
}

// anonymous class implementation
//class AnotherClass {
//    public String doSomething() {
//        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The anonymous class's name is: " + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2");
//    }
//}