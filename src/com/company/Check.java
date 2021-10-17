package com.company;

public class Check {
    private static String[] arabic = {"1","2","3","4","5","6","7","8","9","10"};
    private static String[] roman = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    public static boolean isNum(String s) {
        boolean result = false;
        for (int i = 0; i < arabic.length; i++) {
            if (arabic[i].equals(s)) {
                result = true;
                break;
            } else if (roman[i].equals(s)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isArabic(String s) {
        boolean result = false;
        for (String ar : arabic) {
            if (s.equals(ar)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isRoman(String s) {
        boolean result = false;
        for (String ar : roman) {
            if (s.equals(ar)) {
                result = true;
                break;
            }
        }
        return result;
    }
}