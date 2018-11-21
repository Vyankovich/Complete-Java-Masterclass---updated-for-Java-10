package com.victor;

/**
 * Created by dev on 18.11.2018.
 */
public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityInStock;
    private int reserved;

//    public StockItem(String name, double price) {
//        this.name = name;
//        this.price = price;
//        this.availableQuantity = 0; // or here (but you wouldn't normally do both).
//        this.reserved = 0;
//    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityStock;
        this.reserved = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityReserved() {
        return reserved;
    }

    public int availableQuantity() {
        return quantityInStock - reserved; // we are not gonna change actual stock count if its not adding or selling
    }


    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity >= 0) {
            this.quantityInStock = newQuantity;
        }
    }

    public int reserveStock(int quantity) {
        if (quantity <= this.quantityInStock) {
            this.reserved += quantity;
//            this.availableQuantity -= quantity; // commented cos we are not gonna change actual stock count
            return quantity;
        }
        return 0;
    }

    public int unreserveStock(int quantity) {
        if (quantity <= this.reserved) {
            this.reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public int finaliseStock(int quantity) {
        if (quantity <= reserved) {
            quantityInStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
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
//        System.out.println("Entering StockItem.CompareTo");
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
        return this.name + ": " + this.price + ". Reserved: " + this.reserved;
    }
}