package com.company;

public class Calc {
    public static String calculation(String a, String b, String c) throws Exception {
        int x;
        int y;
        try {
            x = Integer.parseInt(a);
            y = Integer.parseInt(b);
        } catch (NumberFormatException ex) {
            x = Integer.parseInt(Convert.romanToArabic(a));
            y = Integer.parseInt(Convert.romanToArabic(b));
        }
        int res = switch (c) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> throw new Exception("throws Exception //т.к.строка не является математической операцией");
        };
        return Integer.toString(res);
    }
}