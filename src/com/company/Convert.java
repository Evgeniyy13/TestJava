package com.company;

public class Convert {
    public static String romanToArabic(String s) {
        switch (s) {
            case "I" -> s = "1";
            case "II" -> s = "2";
            case "III" -> s = "3";
            case "IV" -> s = "4";
            case "V" -> s = "5";
            case "VI" -> s = "6";
            case "VII" -> s = "7";
            case "VIII" -> s = "8";
            case "IX" -> s = "9";
            case "X" -> s = "10";
        }
        return s;
    }

    public static String arabicToRoman(String s) throws Exception {
        int x = (Integer.parseInt(s));
        if (x < 1) {
            throw new Exception("throws Exception //т.к. в римской системе нет отрицательных чисел");
        }
        String str2 = switch (x % 10) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "";
        };
        String str1 = switch (x / 10) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XC";
            case 10 -> "C";
            default -> "";
        };
        return str1 + str2;
    }
}