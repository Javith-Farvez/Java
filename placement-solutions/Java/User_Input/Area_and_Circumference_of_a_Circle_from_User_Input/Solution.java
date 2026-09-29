/**
 * ============================================================================
 * Problem: Area and Circumference of a Circle from User Input
 * Problem ID: 19
 * Topic: User Input
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Javith
 * Pushed at: 2026-09-29T15:55:06.392Z
 * ============================================================================
 *
 * Description:
 * Read radius r (double). Calculate and print the Area and Circumference of the circle separated by a space, formatted to 2 decimal places. Formula: Area = Math.PI * r * r, Circumference = 2 * Math.PI * r.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
       
        double a=Math.PI*r*r;
        double c=2*Math.PI*r;
        System.out.printf("%.2f %.2f",a,c);
    }
}
