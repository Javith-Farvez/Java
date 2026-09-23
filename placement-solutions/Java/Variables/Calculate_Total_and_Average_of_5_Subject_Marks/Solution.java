/**
 * ============================================================================
 * Problem: Calculate Total and Average of 5 Subject Marks
 * Problem ID: 3
 * Topic: Variables
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Javith
 * Pushed at: 2026-09-23T16:19:39.963Z
 * ============================================================================
 *
 * Description:
 * Read 5 integer marks obtained in 5 subjects. Calculate and print their total sum and exact average (formatted to 2 decimal places) separated by a space.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++){
            int b=sc.nextInt();
            sum+=b;
            

        }
        double avg=sum/5.0;
        System.out.printf("%d %.2f",sum,avg);
        // Read 5 marks and calculate total and average
    }
}
