/*
 * Given an array of integers, find the second largest element.
 * Assume array length ≥ 2
 * Input: [10, 20, 4, 45, 99]
 * Output: 45
 */

import java.util.Scanner;

public class day3_prob2 {
    public static int secondLargest(int[] arr)
    {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > first)
            {
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first)
            {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        System.out.println(secondLargest(arr));
    }
}
