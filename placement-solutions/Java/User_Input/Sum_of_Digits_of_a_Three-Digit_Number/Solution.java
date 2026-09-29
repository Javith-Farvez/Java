/**
 * ============================================================================
 * Problem: Sum of Digits of a Three-Digit Number
 * Problem ID: 20
 * Topic: User Input
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Javith
 * Pushed at: 2026-09-29T15:55:45.467Z
 * ============================================================================
 *
 * Description:
 * Read a positive three-digit integer N (100 to 999). Extract its hundreds, tens, and units digits and print their sum.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h= n/100;
        int t=(n/10)%10;
        int u=n%10;

        System.out.println(h+t+u);

        // Calculate sum of digits
    }
}
