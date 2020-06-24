package com.codewars.kata.train.DRoot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by valera on 24.06.20.
 */
public class DRootExampleTest {
    @Test
    public void Tests() {
        assertEquals( "Nope!" , 7, DRoot.digital_root(16));
        assertEquals( "Nope!" , 6, DRoot.digital_root(456));
    }
}
