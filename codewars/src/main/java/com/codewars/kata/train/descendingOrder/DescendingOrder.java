package com.codewars.kata.train.descendingOrder;

import java.util.Arrays;

/**
 * Created by valera on 24.06.20.
 */
public class DescendingOrder {
    public static int sortDesc(int num) {
        int sorted = 0;
        int counter = 0;
        int[] numArray = new int[10];
        while(num > 0)
        {
            numArray[counter] = num % 10;
            num /= 10;
            counter++;
        }
        long[] longArray = new long[counter];
        for (int i = 0; i < counter; i++) longArray[i] = numArray[i];

        Arrays.sort(longArray);

        //reverse array
        int tmp;
        for (int i = 0; i < (counter / 2); i++)
        {
            tmp = (int)longArray[i];
            longArray[i] = longArray[counter-1-i];
            longArray[counter-1-i] = tmp;
        }

        for (int i = 0; i < counter; i++)
        {
            longArray[i] = longArray[i] * (long)Math.pow(10, counter - i -1);
            sorted += longArray[i];
        }

        return sorted;
    }
}
