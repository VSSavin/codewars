package com.codewars.kata.train.sortTheOdd;

/**
 * Created by valera on 21.06.20.
 */
public class Kata {
    public static int[] sortArray(int[] array) {
        if (array.length == 0) return array;
        else return insertSortOdd(array);
    }

    public static int[] insertSortOdd(int[] arraySrc)
    {
        int[] array = arraySrc.clone();
        for (int i = 0; i < arraySrc.length; i++)
        {
            if (((arraySrc[i] % 2) == 0) || (arraySrc[i] == 0))
            {
                array = removeElement(array, arraySrc[i]);
            }
        }

        array = insertSort(array);
        int indexArray = 0;

        for (int i = 0; i < arraySrc.length; i++)
        {
            if (((arraySrc[i] % 2) != 0) && (arraySrc[i] != 0))
            {
                arraySrc[i] = array[indexArray];
                indexArray++;
            }
        }

        return arraySrc;
    }

    public static int[] removeElement(int[] array, int element)
    {
        int removeCounts = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == element) removeCounts++;
        }

        if (removeCounts == 0) return array;
        int[] newArray = new int[array.length - removeCounts];
        int newArrayIndex = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != element)
            {
                newArray[newArrayIndex] = array[i];
                newArrayIndex++;
            }
        }

        return newArray;
    }

    public static int[] insertSort(int[] array)
    {
        int key;
        int i;
        for (int j = 1; j < array.length; j+=1)
        {
            key = array[j];
            i = j - 1;
            while((i >= 0) && (array[i] > key))
            {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i+1] = key;
        }

        for (i = 0; i < array.length; i++) System.out.println(array[i]);
        return array;
    }
}


