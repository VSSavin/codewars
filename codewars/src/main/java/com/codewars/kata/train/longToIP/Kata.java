package com.codewars.kata.train.longToIP;

/**
 * Created by valera2 on 02.07.20.
 */
public class Kata {
    public static String longToIP(long ip) {
        return (ip >> 24) + "." + ((ip >> 16) & 0xFF) + "." + ((ip >> 8) & 0xFF) + "." + (ip  & 0xFF);
    }
}
