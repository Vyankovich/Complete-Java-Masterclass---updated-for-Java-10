package com.victor;

/**
 * Created by dev on 03.11.2018.
 */
// Object scope is the block in which it's declared including any contained blocks
public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1; // entire class scope check

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ", varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2; // method scope check
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varTree form outer class: " + innerClass.varThree);
    }


    public class InnerClass {
        private int varThree = 3; // inner class scope check

        public InnerClass () {
            System.out.println("InnerClass created, varOne is " + varOne + " and varThree is " + varThree);
        }

        public void timesTwo() {
            System.out.println("varOne is still available here: " + varOne);
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * varThree);
            }
        }
    }
}
