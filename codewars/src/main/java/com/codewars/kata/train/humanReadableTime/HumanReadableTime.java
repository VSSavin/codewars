package com.codewars.kata.train.humanReadableTime;

/**
 * Created by valera2 on 30.06.20.
 */
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int HH = seconds / 3600;
        int MM = (seconds - (HH * 3600)) / 60;
        seconds = seconds - ((HH * 3600) + (MM * 60));
        return (HH < 10? "0" + HH : HH) + ":" + (MM < 10 ? "0" + MM : MM)+ ":" + (seconds < 10? "0" + seconds : seconds);
    }
}
