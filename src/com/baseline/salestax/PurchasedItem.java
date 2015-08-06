package com.baseline.salestax;

import java.util.ArrayList;

public class PurchasedItem {
   private int count;
   private ArrayList<String> details;
   private double price;
   private double taxAmountPerItem;

   public PurchasedItem(int count, ArrayList<String> details, double price, double taxAmountPerItem) {
      this.count = count;
      this.details = details;
      this.price = price;
      this.taxAmountPerItem = taxAmountPerItem;
   }

   public double calculateTotalAmountForItem() {
      double total = count * (price + taxAmountPerItem);
      return roundOff(total);
   }

   private double roundOff(double total) {
      return total;
   }
}
