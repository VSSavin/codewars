package com.codewars.kata.utils;

import java.util.Date;

/**
 * Created by valera2 on 30.06.20.
 */
public class TimeMeasure {
    private static long startedTime = 0;
    private static long endedTime = 0;

    public static void startMeasure()
    {
        startedTime = new Date().getTime();
    }

    //in seconds
    public static double getMeasuredTime()
    {
        endedTime = new Date().getTime();
        return (double)(endedTime - startedTime) / 1000;
    }
}
