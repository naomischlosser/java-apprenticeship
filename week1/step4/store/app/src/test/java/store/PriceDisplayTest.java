package store;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PriceDisplayTest {
  @Test public void testVacuumCleanerPrice() {
    PriceDisplay pd = new PriceDisplay();
    assertEquals(String.valueOf("The price for item: vaccum cleaner is 60"), pd.getPriceLabel("vaccum cleaner", 60));
  }
}
