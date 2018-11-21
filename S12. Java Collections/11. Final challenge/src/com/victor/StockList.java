package com.victor;

import com.sun.jdi.Value;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by dev on 19.11.2018.
 */
public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            // so its going to get the item if it already exists in the map
            // and if it doesn't exist its going to use this

            // check if we already have quantities of ths item
            StockItem inStock = list.getOrDefault(item.getName(),item);
//            StockItem inStock = list.get(item.getName()); // different way of writing
            // if there are already stocks on this item, adjust the quantity
            if (inStock != item) {
//            if (inStock != null) {
                item.adjustStock(inStock.availableQuantity());
            }
// so we're adding a new stock items to the list and updating them essentially if
// it was already a stocked item with that name
            list.put(item.getName(),item);
            return item.availableQuantity();
        }
        return 0;
    }

    public int reserveStock(String item, int quantity) {
        StockItem reserved = list.getOrDefault(item, null);
        if ((reserved != null) && (reserved.availableQuantity() >= quantity) && (quantity > 0)) {
            return reserved.reserveStock(quantity);
        }
        return 0;
    }

    public int unReserveStock(String item, int quantity) {
        StockItem unreserved = list.getOrDefault(item, null);
        if ((unreserved != null) && (unreserved.quantityReserved() >= quantity) && (quantity > 0)) {
            return unreserved.unreserveStock(quantity);
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.get(item);
        if ((inStock != null) && (quantity > 0)) {
            return inStock.finaliseStock(quantity);
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, Double> PriceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            prices.put(item.getKey(),item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock list\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.availableQuantity();

            s = s + stockItem + ". There are " + stockItem.availableQuantity() + " in stock. Value of items: ";
            s = s + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }
        return s + "Total stock value " + totalCost;
    }
}