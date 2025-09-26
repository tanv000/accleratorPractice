/*
Write a program to implement binary search on a sorted array. If the element 
is present, return its index; otherwise, return -1.
 input: arr = [1, 3, 5, 7, 9, 11], target = 7
 output: Element found at index 3
 Hint for Students
 Use two pointers (low, high) and repeatedly check the mid element. 
*/

import java.util.Scanner;

public class day2_prob1 {

    public static int binarySearch(int[] arr, int x)
    {
        int low = 0, high = arr.length - 1;
        

        while(low <= high)
        {
            int mid = (high + low)/2;
            if(arr[mid] == x)
            {
                return mid;
            }

            else if(arr[mid] > x)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        System.out.println("Element found at index "+binarySearch(arr, x));
    }
}
