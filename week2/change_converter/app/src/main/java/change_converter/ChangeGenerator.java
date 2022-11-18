/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package change_converter;

import java.util.ArrayList;

public class ChangeGenerator {
  private static final int[] cents = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

  public static ArrayList<Integer> convert(Double value) {
    ArrayList<Integer> notesAndCoins = new ArrayList<>();

    double cents = value * 100;

    Integer newValue = (int) cents;

    notesAndCoins.add(newValue);

    return notesAndCoins;
  }
}
