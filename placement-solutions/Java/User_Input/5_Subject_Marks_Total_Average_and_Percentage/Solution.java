/**
 * ============================================================================
 * Problem: 5 Subject Marks Total, Average, and Percentage
 * Problem ID: 17
 * Topic: User Input
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Javith
 * Pushed at: 2026-09-29T15:53:48.826Z
 * ============================================================================
 *
 * Description:
 * Read 5 subject marks (maximum 100 per subject). Calculate and print the Total, Average, and Percentage. Since each subject is out of 100, Average and Percentage are numerically identical. Print Total as integer, Average with 2 decimal places, and Percentage with 2 decimal places separated by space.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int total=0;


        for(int i=0;i<5;i++){
            int b=sc.nextInt();
            total+=b;
            

        }
        double avg=total/5.0;
        double percentage=(total/500.0)*100;
        System.out.printf("%d %.2f %.2f%%",total,avg,percentage);
        // Read 5 marks
    }
}
