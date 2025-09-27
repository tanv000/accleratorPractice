/*
 * .You are given two sorted arrays. Merge them into a single sorted array.
 Input: arr1 = [1,3,5], arr2 = [2,4,6]
 Output: [1,2,3,4,5,6]
 */

import java.util.Arrays;
import java.util.Scanner;

public class day3_prob3 {
    public static int[] mergeSorted(int arr1[], int arr2[])
    {
        int i=0, j=0, k=0;
        int res[] = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] <= arr2[j])
                res[k++] = arr1[i++];
            else
                res[k++] = arr2[j++];
        }

        while(i < arr1.length)
            res[k++] = arr1[i++];

        while(j < arr2.length)
            res[k++] = arr2[j++];

        return res;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for(int i=0; i<n1; i++) 
        {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for(int i=0; i<n2; i++) 
        {
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(mergeSorted(arr1, arr2)));

        
    }
}
