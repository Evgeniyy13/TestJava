package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = sc.nextLine().split(" ");
        sc.close();
        if (arr1.length != 3) {
            throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        String a = arr1[0], c = arr1[1], b = arr1[2];
        if (!Check.isNum(a) || !Check.isNum(b)) {
            throw new Exception("throws Exception //т.к. формат введенного значения не удовлетворяет заданию - арабские или римские целые числа от 1 до 10 включительно");

        }
        if ((Check.isArabic(a) && Check.isArabic(b))) {
            System.out.println(Calc.calculation(a, b, c));
        } else if ((Check.isRoman(a)) && (Check.isRoman(b))) {
            System.out.println(Convert.arabicToRoman(Calc.calculation(a, b, c)));
        } else
            throw new Exception("throws Exception //т.к. используются одновременно разные системы счисления");
    }
}
