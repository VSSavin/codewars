package com.codewars.kata.train.deadFish;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by valera on 24.06.20.
 */
public class ExampleTests {
    @org.junit.Test
    public void exampleTests() {
        assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
    }
}
