/**
 * ============================================================================
 * Problem: Calculate Exact Average of Two Integers Using Type Casting
 * Problem ID: 23
 * Topic: Type Casting
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Javith
 * Pushed at: 2026-09-30T14:35:31.451Z
 * ============================================================================
 *
 * Description:
 * Read two integers A and B. Calculate their exact average using type casting to prevent integer division truncation. Print the average formatted to 1 decimal place.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c=(double)(a+b)/2.0;
        System.out.println(c);
        // Calculate exact average using casting
    }
}
