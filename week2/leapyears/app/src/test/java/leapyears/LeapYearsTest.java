/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leapyears;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Boolean.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearsTest {
  // testing isLeapYear
  @Test public void testYear2000IsLeapYear() {
    int year = 2000;
    assertEquals(TRUE, LeapYears.isLeapYear(year));
  }

  @Test public void testYear1700IsNotLeapYear() {
    int year = 1700;
    assertEquals(FALSE, LeapYears.isLeapYear(year));
  }

  @Test public void testYear2004IsLeapYear() {
    int year = 2004;
    assertEquals(TRUE, LeapYears.isLeapYear(year));
  }

  @Test public void testYear2009IsLeapYear() {
    int year = 2009;
    assertEquals(FALSE, LeapYears.isLeapYear(year));
  }

  // testing getLeapYears
  @Test public void testLeapYearsBetween2000And2005() {
    int startYear = 2000;
    int endYear = 2005;
    Integer[] allLeapYears = {2000, 2004};
    assertEquals(Arrays.asList(allLeapYears), LeapYears.getLeapYears(startYear, endYear));
  }

  @Test public void testLeapYearsBetween2005And2015() {
    int startYear = 2005;
    int endYear = 2015;
    Integer[] allLeapYears = {2008, 2012};
    assertEquals(Arrays.asList(allLeapYears), LeapYears.getLeapYears(startYear, endYear));
  }

  @Test public void testNearestLeapYearFor1999() {
    int year = 1999;
    assertEquals(2000, LeapYears.getClosestLeapYear(year));
  }

  @Test public void testNearestLeapYearFor2005() {
    int year = 2005;
    assertEquals(2004, LeapYears.getClosestLeapYear(year));
  }

  @Test public void testNearestLeapYearFor2000() {
    int year = 2000;
    assertEquals(2000, LeapYears.getClosestLeapYear(year));
  }
}
