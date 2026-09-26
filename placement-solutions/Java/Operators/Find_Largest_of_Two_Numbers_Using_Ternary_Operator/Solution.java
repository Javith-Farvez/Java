/**
 * ============================================================================
 * Problem: Find Largest of Two Numbers Using Ternary Operator
 * Problem ID: 12
 * Topic: Operators
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Javith
 * Pushed at: 2026-09-26T00:14:56.921Z
 * ============================================================================
 *
 * Description:
 * Given two integers A and B, determine the larger number using the ternary operator (?:) and print it. If both are equal, print either.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>=b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
        // Use ternary operator to find and print max
    }
}
