package com.codewars.kata.train.expandedForm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by valera on 24.06.20.
 */
public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", Kata.expandedForm(12));
        assertEquals("40 + 2", Kata.expandedForm(42));
        assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
        assertEquals("9000000", Kata.expandedForm(9000000));
    }
}
