/**
 * ============================================================================
 * Problem: Calculate Electricity Bill Using Units and Rate
 * Problem ID: 5
 * Topic: Variables
 * Difficulty: MEDIUM
 * Status: Solved / Accepted
 * Author: Javith
 * Pushed at: 2026-09-23T16:50:02.302Z
 * ============================================================================
 *
 * Description:
 * Given units consumed (integer) and rate per unit (double), calculate the total bill amount. A fixed meter surcharge of 50.00 is added to every bill. Formula: Bill = (units * rate) + 50.00. Print the final bill amount formatted to 2 decimal places.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double rate = sc.nextDouble();
        double energy=units*rate;
        double s=50.00;
        double total=energy+s;
        System.out.printf("%.2f",total);
        // Calculate and print bill
    }
}
