package com.codewars.kata.utils;

/**
 * Created by valera2 on 30.06.20.
 */
public class RandomString {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static String randomAlphaNumeric(int count) {
        char[] characters = new char[count];
        //test for commit
        //StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            characters[count] = (char)character;
            //builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        //return builder.toString();
        return new String(characters);
    }
}
