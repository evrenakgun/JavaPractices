import org.junit.Test;

import static org.junit.Assert.*;

public class SampleTest {
    Sample sample = new Sample();

    @Test
    public void getMyName() {
        //arrange
        String expected = "Evren Akgün";

        //act
        String result = sample.getMyName();

        //assert
        assertEquals(expected,result);
    }

    @Test
    public void addTwoNumbers() {
        //arrange
        int expected = 30;

        //act
        int result = sample.addTwoNumbers(10,20);

        //assert
        assertEquals(expected,result);
    }

    @Test
    public void isPositive() {
        //act
        boolean result = sample.isPositive(100);

        //assert
        assertTrue(result);
    }

    @Test
    public void getTokens() {
        //arrange
        String text = "a,b,c,d";
        String separator = ",";
        String[] expected = new String[]{"a","b","c","d"};

        //act
        String[] result = sample.getTokens(text, separator);

        //assert
        assertNotNull(result);
        assertEquals(expected.length, result.length);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
        assertEquals(expected[2], result[2]);
        assertEquals(expected[3], result[3]);
    }

}
