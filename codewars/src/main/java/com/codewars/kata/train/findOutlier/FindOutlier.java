package com.codewars.kata.train.findOutlier;

/**
 * Created by valera on 24.06.20.
 */
public class FindOutlier{
    static int find(int[] integers){

        boolean isEven;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 3; i++)
        {
            if ((integers[i] & 0x01) == 0) evenCount ++;
            else oddCount++;
        }

        isEven = evenCount > oddCount;

        if (isEven)
        {
            for (int i = 0; i < integers.length; i++)
            {
                if ((integers[i] & 0x01) == 0x01) return integers[i];
            }
        }
        else
        {
            for (int i = 0; i < integers.length; i++)
            {
                if ((integers[i] & 0x01) == 0x00) return integers[i];
            }
        }
        return 0;
    }}
