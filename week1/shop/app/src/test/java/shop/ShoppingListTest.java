package shop;

import static org.junit.Assert.*;
import org.junit.*;

public class ShoppingListTest {
  @Test public void testGetsInitialEmptyShoppingList() {
    ShoppingList shoppingList = new ShoppingList();
    assertTrue(shoppingList.getItems().isEmpty());
  }

  @Test public void testAddsAnItemToTheShoppingList() {
    ShoppingList shoppingList = new ShoppingList();
    shoppingList.addItem("Cookies");
    assertEquals(String.valueOf("Cookies"), shoppingList.getItems().get(0));
  }
}
