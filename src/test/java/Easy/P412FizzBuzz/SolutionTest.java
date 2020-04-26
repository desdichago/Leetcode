package Easy.P412FizzBuzz;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() {
        solution = new Solution3();
    }

    @Test
    public void fizzBuzz1() {
        int input = 1;
        List<String> expected = new ArrayList<>();
        expected.add("1");
        List<String> actual = solution.fizzBuzz(input);
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzz15() {
        int input = 15;
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        expected.add("Fizz");
        expected.add("7");
        expected.add("8");
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("11");
        expected.add("Fizz");
        expected.add("13");
        expected.add("14");
        expected.add("FizzBuzz");
        List<String> actual = solution.fizzBuzz(input);
        assertEquals(expected, actual);
    }
}