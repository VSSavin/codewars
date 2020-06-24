package com.codewars.kata.train.highestScoringWorld;

import java.nio.charset.StandardCharsets;

/**
 * Created by valera on 24.06.20.
 */
public class Kata {

    public static String high(String s) {
        String[] splitted = s.split(" ");
        int maxScoreIndex = 0;
        int maxScoreValue = 0;
        for (int i = 0; i < splitted.length; i++)
        {
            int scores = getScores(splitted[i]);
            if (scores > maxScoreValue)
            {
                maxScoreValue = scores;
                maxScoreIndex = i;
            }
        }
        return splitted[maxScoreIndex];
    }

    private static int getScores(String s)
    {
        byte[] b = s.getBytes(StandardCharsets.US_ASCII);
        int scores = 0;
        for (byte point: b)
        {
            scores+=(point - 0x60);
        }
        return scores;
    }

}
