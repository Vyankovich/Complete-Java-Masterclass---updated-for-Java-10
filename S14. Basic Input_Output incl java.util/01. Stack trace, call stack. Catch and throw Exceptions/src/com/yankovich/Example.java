package com.yankovich;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
            // the way to catch multiple exceptions
        } catch (ArithmeticException | NoSuchElementException e) { // bit wise inclusive OR
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }
    }

    private static int divide() {
        int x = 0;
        int y = 0;
//        try {
        x = getInt();
        y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x/ y;
//        } catch (NoSuchElementException e) {
//            throw new NoSuchElementException("no suitable input");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("attempt to divide by zero");
//        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        while(true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                // go round again. Read past the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using only the digits from 0 to 9");
            }
        }
    }

}
/*
* java automatically prints a stack trace which is showing the call stack so the call stack is
* a list of all methods called at any particular point in a program's execution.
*
* Each thread of execution has its own call stack and the thread is shown as the first line of
* the stack trace. So every time a new method is called it's actually placed onto the stack
* and when a methods returns its then removed from the stack.
*/