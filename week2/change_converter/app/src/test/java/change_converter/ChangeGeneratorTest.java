/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package change_converter;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ChangeGeneratorTest {
  @Test public void testConvert50Pounds() {
    Double value = 50.00;
    Integer[] result = {5000};
    assertEquals(Arrays.asList(result), ChangeGenerator.convert(value));
  }

  @Test public void testConvert50Pence() {
    Double value = 0.50;
    Integer[] result = {5000};
    assertEquals(Arrays.asList(result), ChangeGenerator.convert(value));
  }

  @Test public void testConvert15Pounds() {
    Double value = 15.00;
    Integer[] result = {1000, 500};
    assertEquals(Arrays.asList(result), ChangeGenerator.convert(value));
  }

}
