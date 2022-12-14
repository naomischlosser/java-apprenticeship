/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leapyears;

import java.util.ArrayList;

public class LeapYears {
  public static Boolean isLeapYear(int year) {
    return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
  }

  public static ArrayList<Integer> getLeapYears(int startYear, int endYear) {
    ArrayList<Integer> allLeapYears = new ArrayList<>();

    for (int year = startYear; year <= endYear; year++) {
      if (isLeapYear(year)) allLeapYears.add(year);
    }

    return allLeapYears;
  }

  public static int getClosestLeapYear(int year) {
    int delta = 4;
    ArrayList<Integer> leapYears = getLeapYears(year - delta, year + delta);

    int nearest = delta;
    int bestDeltaFoundYet = delta;

    for (Integer leapYear : leapYears) {
      if (leapYear == year) {
        return leapYear;
      } else {
        int d = Math.abs(year - leapYear);
        if (d < bestDeltaFoundYet) {
          bestDeltaFoundYet = d;
          nearest = leapYear;
        }
      }
    }

    return nearest;
  }
}
