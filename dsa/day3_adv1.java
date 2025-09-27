/*
 * Given an integer array nums, return an array output where output[i] is the 
product of all elements in nums except nums[i]. Do not use division.
 Input: nums = [1, 2, 3, 4]
 Output: [24, 12, 8, 6]
 */

import java.util.Arrays;
import java.util.Scanner;

public class day3_adv1{

    public static int[] prod(int[] arr)
    {
        int n = arr.length;
        int[] res = new int[n];
        // prefix array
        int[] prefix = new int[n];
        prefix[0] = 1;
        for(int i = 1; i < n; i++)
        {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }

        // suffix array
        int[] suffix = new int[n];
        suffix[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--)
        {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }

        // resultant array = prefix[i] * suffix[i]
        for(int i = 0; i < n; i++)
        {
            res[i] = prefix[i] * suffix[i];
        }
        return res;
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

        System.out.println(Arrays.toString(prod(arr)));
    }
 }