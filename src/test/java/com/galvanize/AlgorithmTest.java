package com.galvanize;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class AlgorithmTest {
    @Test
    public void testAllEqualStringArgumentToBeTrue() {
        Algorithm algorithm = new Algorithm();
        String arg = "AaaaaAAA";
        boolean actual = algorithm.allEqual(arg);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testAllEqualStringArgumentToBeFalse() {
        Algorithm algorithm = new Algorithm();
        String arg = "AaaaabAAA";
        assertFalse(algorithm.allEqual(arg));
    }

    @Test
    public void testLetterCountTrue() {
        Algorithm algorithm = new Algorithm();
        String arg = "abBcd";
        Map<String, Long> expected = new HashMap<>();
        expected.put("a", 1L);
        expected.put("b", 2L);
        expected.put("c", 1L);
        expected.put("d", 1L);
        System.out.print(algorithm.letterCount(arg));
        assertTrue(algorithm.letterCount(arg).equals(expected));
    }

    @Test
    public void testLetterCountFalse() {
        Algorithm algorithm = new Algorithm();
        String arg = "abBcdz";
        Map<String, Long> expected = new HashMap<>();
        expected.put("a", 1L);
        expected.put("b", 2L);
        expected.put("c", 1L);
        expected.put("d", 1L);
        System.out.print(algorithm.letterCount(arg));
        assertFalse(algorithm.letterCount(arg).equals(expected));
    }

    @Test
    public void testLetterCountEmptyInput() {
        Algorithm algorithm = new Algorithm();
        String arg = "";
        Map<String, Long> expected = new HashMap<>();
        assertTrue(algorithm.letterCount(arg).equals(expected));
    }

    @Test
    public void interleaveTrue(){
        Algorithm algorithm = new Algorithm();
        String expected = "adbecf";
        String actual = algorithm.interleave(Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f"));
        assertEquals(expected, actual);
    }

    @Test
    public void interleaveFalse(){
        Algorithm algorithm = new Algorithm();
        String expected = "adbecd";
        String actual = algorithm.interleave(Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f"));
        assertEquals(expected, actual);
    }

    @Test
    public void interleaveEmptyList(){
        Algorithm algorithm = new Algorithm();
        String expected = "";
        String actual = algorithm.interleave(Collections.emptyList(), Collections.emptyList());
        assertEquals(expected, actual);
    }
}
