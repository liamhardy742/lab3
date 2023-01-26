import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedOddLength() {
    int[] input1 = {1,2,3,4,5};
    int[] output1 = {5,4,3,2,1};
    int[] result = ArrayExamples.reversed(input1);
    printOutput(result);
    assertArrayEquals(output1, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedEvenLength() {
    int[] input1 = {1,2};
    int[] output1 = {2,1};
    int[] result = ArrayExamples.reversed(input1);
    printOutput(result);
    assertArrayEquals(output1, ArrayExamples.reversed(input1));
  }

  public void printOutput(int[] result) {
    System.out.print("\n[ ");
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
    }
    System.out.println("]");
  }


  @Test
  public void testAverageWithoutLowestLessThanTwo() {
    double[] testArray = {1,2};
    assertEquals(2.0,ArrayExamples.averageWithoutLowest(testArray),0.0001);
  }
}
