package store;

public class PriceDisplay {
  public String getPriceLabel(String item, int price) {
    return String.format("The price for item: %s is %d", item, price);
  }
}
