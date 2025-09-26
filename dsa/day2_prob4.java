/*
 * Find the factorial of a number n using recursion.
 input: Find the factorial of a number n using recursion.
 output: Factorial of 5 is 120
 */

import java.util.Scanner;

public class day2_prob4 {

    public static int fact(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        return n * fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is "+fact(n));
    }
}
