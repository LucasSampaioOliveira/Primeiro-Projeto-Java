package com.h2;

public class Utilities {
    // float, long, int

    public static float getFloatValue(String in) {
        float out = 0.0f;
        try {
            out = Float.parseFloat(in);
        } catch (NumberFormatException e) {
            System.out.println(in + " cannot be converted into a 'float' value. Exiting program.");
        }
        return out;
    }

    public static long getLongValue(String in) {
        long out = 0;
        try {
            out = Long.parseLong(in);
        } catch (NumberFormatException e) {
            System.out.println(in + " cannot be converted into a 'long' value. Exiting program.");
        }
        return out;

    }

    public static int getIntValue(String in) {
        int out = 0;
        try {
            out = Integer.parseInt(in);
        } catch (NumberFormatException e) {
            System.out.println(in + " cannot be converted into a 'float' value. Exiting program.");
        }
        return out;
    }
}
