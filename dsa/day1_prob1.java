/* Write a program to reverse an array of integers in place.
 input: arr = [1, 2, 3, 4, 5]
 output: [5, 4, 3, 2, 1]
 Hint for Students :
 Use two pointers (start, end) and swap until they meet.
 */

import java.util.*;
public class day1_prob1
{
    public static int[] reverseArray(int start, int end, int[] a)
    {
        while(start <= end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        return a;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(reverseArray(0, n-1, arr)));
    }
}