/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package change_converter;

import java.util.ArrayList;

public class ChangeGenerator {

  public static ArrayList<String> convert(Double value) {
    String formattedValue;
    ArrayList<String> notesAndCoins = new ArrayList<>();

    if (value >= 1) {
      formattedValue = String.format("£%.0f", value);
    } else {
      formattedValue = String.format("%.0fp", value * 100);
    }

    notesAndCoins.add(formattedValue);

    return notesAndCoins;
  }
}
