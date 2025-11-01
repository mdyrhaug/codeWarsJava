package com.marksbasement.codewars.kyu8;

/**
 * Code Wars URL:  https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1
 *
 * parse the incoming String.  The first element is always a number.  Return it.
 *
 * You ask a small girl "How old are you?" She always says "x years old", where x is a random number between 0 and 9.
 * Write a program that returns the girl's age (0-9) as an integer.
 * Assume the test input string is always a valid string. For example, the test input may be "1 year old" or "5 years old". The first character in the string is always a number.
 */
public class ParseNiceIntFromCharProblem {

    public static void main(String[] args) {

        final String herOld = "5 years old";

        String[] words = herOld.split(" ");
        System.out.println(Integer.valueOf(words[0]));
    }
}
