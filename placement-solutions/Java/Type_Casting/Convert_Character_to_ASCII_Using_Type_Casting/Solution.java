/**
 * ============================================================================
 * Problem: Convert Character to ASCII Using Type Casting
 * Problem ID: 24
 * Topic: Type Casting
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Javith
 * Pushed at: 2026-09-30T14:37:07.411Z
 * ============================================================================
 *
 * Description:
 * Read a character from input. Explicitly cast the char variable into an int variable and print the integer ASCII code.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int i=(int)ch;
        System.out.println(i);
        // Cast char to int and print
    }
}
