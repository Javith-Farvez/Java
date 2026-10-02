/**
 * ============================================================================
 * Problem: Check Prime Number Using Conditional Logic
 * Problem ID: 29
 * Topic: if, if else, nested if
 * Difficulty: MEDIUM
 * Status: Solved / Accepted
 * Author: Javith
 * Pushed at: 2026-10-02T14:40:35.857Z
 * ============================================================================
 *
 * Description:
 * Given an integer N, check whether N is a Prime number. A prime number is greater than 1 and has no positive divisors other than 1 and itself. Print "Prime" or "Not Prime".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            
        }
        if(count==2){
                System.out.println("Prime");
            }
            
            else{
                System.out.println("Not Prime");
            }
        // Check if n is prime
    }
}
