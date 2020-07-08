package com.codewars.kata.train.simpleAssembler;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by valera2 on 03.07.20.
 */
public class SolutionTest {
    @Test
    public void simple1() {
        String[] program = new String[]{"mov a 5","inc a","dec a","dec a","jnz a -1","inc a"};
        Map<String, Integer> out = new HashMap<String, Integer>();
        out.put("a", 1);
        assertEquals(out, SimpleAssembler.interpret(program));
        System.out.println(new SimpleAssembler().toString());
    }

    @Test
    public void simple2() {
        String[] program = new String[]{"mov a -10","mov b a","inc a","dec b","jnz a -2"};
        Map<String, Integer> out = new HashMap<String, Integer>();
        out.put("a", 0);
        out.put("b", -20);
        assertEquals(out, SimpleAssembler.interpret(program));
        System.out.println(new SimpleAssembler().toString());
    }

    @Test
    public void complex1() {
        String[] program = new String[]{"mov a 1", "mov b 1", "mov c 0", "mov d 26", "jnz c 2", "jnz 1 5", "mov c 7", "inc d", "dec c", "jnz c -2", "mov c a", "inc a", "dec b", "jnz b -2", "mov b c", "dec d", "jnz d -6", "mov c 18", "mov d 11", "inc a", "dec d", "jnz d -2", "dec c", "jnz c -5"};
        Map<String, Integer> out = new HashMap<String, Integer>();
        out.put("a", 318009);
        out.put("b", 196418);
        out.put("c", 0);
        out.put("d", 0);
        assertEquals(out, SimpleAssembler.interpret(program));
        System.out.println(new SimpleAssembler().toString());
    }

    @Test
    public void complex2() {
        String[] program = new String[]{"mov d 100", "dec d", "mov b d", "jnz b -2", "inc d", "mov a d", "jnz 5 10", "mov c a"};
        Map<String, Integer> out = new HashMap<String, Integer>();
        out.put("a", 1);
        out.put("b", 0);
        out.put("d", 1);
        assertEquals(out, SimpleAssembler.interpret(program));
        System.out.println(new SimpleAssembler().toString());
    }
}
