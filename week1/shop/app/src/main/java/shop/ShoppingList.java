package shop;

import java.util.ArrayList;

public class ShoppingList {
  private ArrayList<ShoppingItem> items = new ArrayList<ShoppingItem>();
  
  public ArrayList<ShoppingItem> getItems() {
    return items;
  }

  public void addItem(ShoppingItem item) {
    items.add(item);
  }
}
