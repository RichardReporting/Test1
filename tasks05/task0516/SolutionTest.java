package tasks05.task0516;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    @Test
    public void test1() {
        Solution inputSol = new Solution();
        String input = "Вася\n28\nМ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("Вася 28 М\n" +
                        "Вася 28 x\n" +
                        "Вася 20 x",
                outContent.toString());

    }
}