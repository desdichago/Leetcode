package Easy.P28ImplementstrStr;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    SolutionKMP solution;

    @Before
    public void setUp() {
        solution = new SolutionKMP();
    }

    @Test
    public void strStr1() {
        String inputHaystack = "hello";
        String inputNeedle = "ll";
        int expected = 2;
        int actual = solution.strStr(inputHaystack, inputNeedle);
        assertEquals(expected, actual);
    }

    @Test
    public void strStr2() {
        String inputHaystack = "aaaaa";
        String inputNeedle = "bba";
        int expected = -1;
        int actual = solution.strStr(inputHaystack, inputNeedle);
        assertEquals(expected, actual);
    }

    @Test
    public void strStr3() {
        String inputHaystack = "aaaaa";
        String inputNeedle = "";
        int expected = 0;
        int actual = solution.strStr(inputHaystack, inputNeedle);
        assertEquals(expected, actual);
    }

    @Test
    public void strStr4() {
        String inputHaystack = "";
        String inputNeedle = "a";
        int expected = -1;
        int actual = solution.strStr(inputHaystack, inputNeedle);
        assertEquals(expected, actual);
    }

    @Test
    public void strStr5() {
        String inputHaystack = "mississippi";
        String inputNeedle = "issip";
        int expected = 4;
        int actual = solution.strStr(inputHaystack, inputNeedle);
        assertEquals(expected, actual);
    }

    @Test
    public void strStr6() {
        String inputHaystack = "mississippi";
        String inputNeedle = "issipi";
        int expected = -1;
        int actual = solution.strStr(inputHaystack, inputNeedle);
        assertEquals(expected, actual);
    }

    @Test
    public void strStr7() {
        String inputHaystack = "a";
        String inputNeedle = "a";
        int expected = 0;
        int actual = solution.strStr(inputHaystack, inputNeedle);
        assertEquals(expected, actual);
    }
}