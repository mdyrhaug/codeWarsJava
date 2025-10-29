package com.marksbasement.codewars.kyu8;

/**
 * CodeWare URL:  https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce
 */

public class MultiplicationTableForNumber {

    public static void main(String... args) {
        int num = Integer.valueOf(args[0]);

        StringBuffer sb = new StringBuffer();

        for (int x = 1; x < 11; x++) {
            sb.append(x + " * " + num + " = " + x * num);
            if (x < 10) sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
