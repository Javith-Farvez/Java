/**
 * ============================================================================
 * Problem: Swap Two Numbers Using a Third Variable
 * Problem ID: 1
 * Topic: Variables
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Javith
 * Pushed at: 2026-09-23T15:19:44.216Z
 * ============================================================================
 *
 * Description:
 * Given two integers A and B, swap their values using a third temporary variable and print the swapped values separated by a space.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp=a;
        a=b;
        b=temp;

        System.out.print(a+" "+b);
        
        // Write your code here to swap using a third variable
        
    }
}
