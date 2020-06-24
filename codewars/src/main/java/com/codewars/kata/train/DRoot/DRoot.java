package com.codewars.kata.train.DRoot;

/**
 * Created by valera on 24.06.20.
 */
public class DRoot {
    public static int digital_root(int n) {
        int sum = 0;
        int remainder;
        while(n > 0)
        {
            remainder = n % 10;
            sum = sum + remainder;
            n = n / 10;
            if (sum > 9) sum = digital_root(sum);
        }
        return sum;
    }
}
