package shop;

import static org.junit.Assert.*;
import org.junit.*;

public class ShoppingListTest {
  @Test public void testGetsInitialEmptyShoppingList() {
    ShoppingList list = new ShoppingList();
    assertTrue(list.getItems().isEmpty());
  }

  @Test public void testAddsAnItemToTheShoppingList() {
    ShoppingList list = new ShoppingList();
    list.addItem(new ShoppingItem("Cookies", 2.95));
    list.addItem(new ShoppingItem("Salmon", 6.50));
    assertEquals(2, list.getItems().size());
  }
}
