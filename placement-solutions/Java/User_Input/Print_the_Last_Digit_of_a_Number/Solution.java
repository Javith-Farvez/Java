/**
 * ============================================================================
 * Problem: Print the Last Digit of a Number
 * Problem ID: 18
 * Topic: User Input
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Javith
 * Pushed at: 2026-09-29T15:54:28.142Z
 * ============================================================================
 *
 * Description:
 * Read an integer N. Extract and print its last digit. The last digit should always be positive (e.g. last digit of -47 is 7).
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Math.abs(n)%10);
        // Print last digit
    }
}
