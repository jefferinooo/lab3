import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input2 = { 3, 6, 9};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{9, 6, 3}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input2 = { 3, 6, 9 };
    assertArrayEquals(new int[]{ 9, 6, 3 }, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input = {2.4, 2.4, 2.4,2.1};
    assertEquals(2.4, ArrayExamples.averageWithoutLowest(input), 0);
  }
  
}

