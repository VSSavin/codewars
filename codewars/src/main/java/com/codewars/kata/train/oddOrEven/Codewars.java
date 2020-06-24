package com.codewars.kata.train.oddOrEven;

/**
 * Created by valera on 24.06.20.
 */
public class Codewars {
    public static String oddOrEven (int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        if ((sum & 0x01) == 0) return "even";
        else return "odd";
    }
}
