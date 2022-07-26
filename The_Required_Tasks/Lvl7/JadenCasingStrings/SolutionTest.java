package The_Required_Tasks.Lvl7.JadenCasingStrings;

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
        The_Required_Tasks.Lvl7.Mumbling.Solution inputSol = new The_Required_Tasks.Lvl7.Mumbling.Solution();
        String input = "a very small text is written here right now.";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Solution.main(null);
        assertEquals("A Very Small Text Is Written Here Right Now.", outContent.toString());

    }

}