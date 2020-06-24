package com.codewars.kata.train.expandedForm;

import com.sun.corba.se.spi.activation._RepositoryImplBase;

/**
 * Created by valera on 24.06.20.
 */
public class Kata {
    public static String expandedForm(int num)
    {
        int[] nums = new int[10];
        int ct = 0;
        String expanded = "";
        while(num > 0)
        {
            nums[ct] = num % 10;
            num /= 10;
            ct++;
        }
        for (int i = (ct - 1); i >= 0; i--)
        {
            if (nums[i] != 0)
            {
                expanded += ((int)Math.pow(10, i) * nums[i]);
                if (i > 0) expanded += " + ";
            }

        }

        if (expanded.endsWith(" + "))
        {
            expanded = expanded.substring(0, expanded.length() - 3);
        }

        return expanded;
    }
}
