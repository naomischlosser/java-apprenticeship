/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leapyears;

import org.junit.Test;

import static java.lang.Boolean.TRUE;
import static org.junit.Assert.*;

public class LeapYearsTest {
    @Test public void testYear2000IsLeapYear() {
        int year = 2000;
        assertEquals(TRUE, LeapYears.isLeapYear(year));
    }
}
