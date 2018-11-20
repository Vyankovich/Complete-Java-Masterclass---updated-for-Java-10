package com.victor;

/**
 * Created by dev on 18.11.2018.
 */
public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock = 0; // can be initialized later

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0; // or here (but you wouldn't normally do both).
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if (newQuantity >= 0) {
            this.quantityStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if (obj == this) {
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        String  objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31; // It helps in way to avoid collisions
        // and also in a way so that you don't have 1 bucket with 1000 items
        // and another with 1 item
    }

    @Override
    public int compareTo(StockItem obj) {
        System.out.println("Entering StockItem.CompareTo");
        if (this == obj) {
            return 0;
        }
        if (obj != null) {
            return this.name.compareTo(obj.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + ": " + this.price + " zl";
    }
}