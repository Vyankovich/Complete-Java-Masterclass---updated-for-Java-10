package com.victor;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        ptintInstructions();
        while(!quit) {
            System.out.println("Enter your choice");
            choice= scanner.nextInt();
            scanner.nextLine();//to clear an input buffer

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    groceryList.addGroceryItem();
                    break;
                case 3:
                    groceryList.addGroceryItem();
                    break;
                case 4:
                    groceryList.mofidyGroceryItem();
                    break;
                case 5:
                    groceryList.removeGroceryItem();
                    break;
            }
        }

    }
}
