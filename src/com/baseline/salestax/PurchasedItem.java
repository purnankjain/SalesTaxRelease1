package com.baseline.salestax;

public class PurchasedItem {
   private int count;
   private String[] details;
   private double price;
   private double taxAmountPerItem;

   public PurchasedItem(int count, String[] details, double price, double taxAmountPerItem) {
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
