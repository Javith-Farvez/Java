/**
 * ============================================================================
 * Problem: Calculate Percentage of 5 Subjects Without Precision Loss
 * Problem ID: 25
 * Topic: Type Casting
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Javith
 * Pushed at: 2026-09-30T14:45:47.655Z
 * ============================================================================
 *
 * Description:
 * Read 5 integer marks obtained in 5 subjects out of 100 each (maximum total = 500). Calculate the exact percentage using double type casting to avoid integer truncation. Print the percentage formatted to 2 decimal places with a "%" suffix.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avg=0;
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=sc.nextInt();
       
        }
        avg=(double)(sum/500.0)*100.0;
        System.out.printf("%.2f%%",avg);
        // Calculate exact percentage
    }
}
