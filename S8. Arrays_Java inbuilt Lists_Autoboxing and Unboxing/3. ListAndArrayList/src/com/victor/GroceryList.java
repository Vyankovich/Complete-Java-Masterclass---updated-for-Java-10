package com.victor;

import java.util.ArrayList;

/**
 * Created by dev on 06.10.2018.
 */
public class GroceryList {
    // ArrayList is a class and it can have its own constructor (in this case it empty).
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem (String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            groceryList.set(position, newItem);
        } else {
            System.out.println(currentItem + " not found in a list.");
        }
    }
    // we do this method internal because we don't want to expose integer to the calling process
// in other words: user don't need to know indexes of items
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified .");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            groceryList.remove(position);
        }
    }
    // we do this method internal because we don't want to expose integer to the calling process
// in other words: user don't need to know indexes of items
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }
// we do this method internal because we don't want to expose integer to the calling process
// in other words: user don't need to know indexes of items
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }
}