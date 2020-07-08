package com.codewars.kata.train.simpleAssembler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by valera2 on 03.07.20.
 */
public class SimpleAssembler {
    static Map<String, Integer> out = new HashMap<String, Integer>();
    public static Map<String, Integer> interpret(String[] program){
        out.clear();
        System.out.println("Program:\r\n----------\r\n" + Arrays.toString(program));
        System.out.println("----------");

        for (int i = 0; i < program.length; i++)
        {
            String[] data = program[i].split(" ");
            try
            {
                int jmp = processingInstruction(data);
                if (jmp != 0) i = i + jmp - 1;
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
        return out;
    }

    private static int processingInstruction(String[] instruction) throws Exception
    {
        int jmp = 0;
        if (instruction.length > 0)
        {
            switch(instruction[0])
            {
                case "jnz":
                    try
                    {
                        if (!isIntNumeric(instruction[1]))
                        {
                            if (out.get(instruction[1]) != 0) jmp = Integer.parseInt(instruction[2]);
                        }
                        else
                        {
                            if (Integer.parseInt(instruction[1]) != 0) jmp = Integer.parseInt(instruction[2]);
                        }

                    }
                    catch (Exception e)
                    {
                        throw new Exception("instruction: " + Arrays.toString(instruction) + " processing error" , e);
                    }

                    break;
                case "mov":
                    try
                    {
                        if (isIntNumeric(instruction[2]))
                        {
                            out.put(instruction[1], Integer.parseInt(instruction[2]));
                        }
                        else
                        {
                            out.put(instruction[1], out.get(instruction[2]));
                        }

                    }
                    catch (Exception e)
                    {
                        throw new Exception("instruction: " + Arrays.toString(instruction) + " processing error" , e);
                    }

                    break;
                case "inc":
                    try
                    {
                        out.put(instruction[1], out.get(instruction[1]) + 1);
                    }
                    catch (NullPointerException npe)
                    {
                        System.out.println("Unknown register: " + instruction[1]);
                    }

                    break;

                case "dec":
                    try
                    {
                        out.put(instruction[1], out.get(instruction[1]) - 1);
                    }
                    catch (NullPointerException npe)
                    {
                        System.out.println("Unknown register: " + instruction[1]);
                    }

                    break;

                default:
                    throw new Exception("Unsupported command: " + instruction[0]);
            }
        }

        return jmp;
    }

    private static boolean isIntNumeric(String str)
    {
        boolean ret = true;
        try
        {
            Integer.parseInt(str);
        }
        catch (NumberFormatException nfe)
        {
            ret = false;
        }

        return ret;
    }

    @Override
    public String toString() {
        String ret = "";
        int i = 0;
        for (String key : out.keySet()) {
            ret += "Key: " + key + "; Value: " + out.get(key) + "\r\n";
        }
        return ret;
    }
}
