package com.codewars.kata.train.deadFish;

/**
 * Created by valera on 24.06.20.
 */
public class DeadFish {
    public static int[] parse(String data) {
        int value = 0;
        int ct = 0;
        int count = data.length() - data.replaceAll("o","").length();
        int[] ret = new int[count];
        char[] chars = data.toCharArray();
        for (char c: chars)
        {
            switch (c)
            {
                case 'i':
                    value++;
                    break;
                case 'd':
                    value--;
                    break;
                case 's':
                    value *= value;
                    break;
                case 'o':
                    ret[ct] = value;
                    ct++;
                    break;
            }
        }

        return ret;

    }
}