package com.codewars.kata.train.antiString;

/**
 * Created by valera2 on 30.06.20.
 */
public class AntiString {
    public static String antiString(String str){
        //only for US-ASCII encoding
        char[] strArray = str.toCharArray();
        char[] reversedArray = new char[strArray.length];
        for (int i = 0; i < strArray.length; i++)
        {
            if ((strArray[i] > 0x40) && (strArray[i] < 0x5B))   //upper case
            {
                reversedArray[strArray.length - 1 - i] = (char)(25 - (strArray[i] - 0x41));
                reversedArray[strArray.length - 1 - i] += 0x41;
                reversedArray[strArray.length - 1 - i] += 0x20; //change upper case to lower case
            }

            else if ((strArray[i] > 0x60) && (strArray[i] < 0x7B))  //lower case
            {
                reversedArray[strArray.length - 1 - i] = (char)(25 - (strArray[i] - 0x61));
                reversedArray[strArray.length - 1 - i] += 0x61;
                reversedArray[strArray.length - 1 - i] -= 0x20; //change lower case to upper case
            }

            else if ((strArray[i] > 0x2F) && (strArray[i] < 0x3A))  //numbers
            {
                reversedArray[strArray.length - 1 - i] = (char)(9 - (strArray[i] - 0x30));
                reversedArray[strArray.length - 1 - i] += 0x30;
            }

        }
        return new String(reversedArray);
    }
}
