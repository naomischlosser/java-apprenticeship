package shop;

import static org.junit.Assert.*;
import org.junit.*;

public class ShoppingListTest {
  @Test public void testGetsInitialEmptyShoppingList() {
    ShoppingList shoppingList = new ShoppingList();
    assertTrue(shoppingList.getItems().isEmpty());
  }
}
