package shop;

import java.util.ArrayList;

public class ShoppingList {
  private ArrayList<String> items = new ArrayList<String>();
  
  public ArrayList<String> getItems() {
    return items;
  }

  public void addItem(String item) {
    items.add(item);
  }
}
