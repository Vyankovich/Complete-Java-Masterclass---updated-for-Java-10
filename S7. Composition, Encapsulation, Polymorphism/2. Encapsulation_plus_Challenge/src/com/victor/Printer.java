package com.victor;

/**
 * Created by dev on 30.09.2018.
 */
/*
Challenge time
create a class and demonstrate proper encapsulation techniques
the class will be called Printer
It should have fields for the toner Level, number of pages printed, and
also whether its a duplex printer (capable of printing on both sides of the paper).
Add method to fill up toner (up to max of 100%), another method to
simulate printing a page (which should increase the number of pages printed).
Decide on the scope, whether to use constructors, and anything else you think is needed.
*/
public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void fillUpToner(int toner) {
        if (toner > 0) {
            if (this.tonerLevel == 100) {
                System.out.println("No need to fill up. Toner level is 100%.");
            } else if (this.tonerLevel + toner <= 100) {
                this.tonerLevel = this.tonerLevel + toner;
                System.out.println("Toner filled up to " + this.tonerLevel + "%.");
            } else {
                System.out.println("Toner filled up to 100%.");
                this.tonerLevel = 100;
            }
        } else {
            System.out.println("fillUpToner() -> Invalid Value");
        }
    }

    public void printing(int pagesForPrint, boolean duplex) {
        if (pagesForPrint < 0) {
            System.out.println("Printer.printing() -> Invalid input value");
        } else {
            if (this.tonerLevel == 0) {
                System.out.println("Toner level is 0%. Please fill up");
            } else {
                int isPrinted = 0;
                for (int i = this.tonerLevel; i > 0 && pagesForPrint > 0; i--) {
                    isPrinted++;
                    pagesForPrint--;
                    this.tonerLevel--;
                }
                if (pagesForPrint > 0) {
                    System.out.println("Toner level is 0%. Please fill up. Printed pages: " + isPrinted);
                } else {
                    System.out.println("Toner level is " + this.tonerLevel + "%. Printed pages: " + isPrinted);
                }
            }
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
