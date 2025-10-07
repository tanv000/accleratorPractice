/*
 *  Sort an array using Insertion Sort. 
Input Example: 
arr = [12, 11, 13, 5, 6] 
Output Example: 
[5, 6, 11, 12, 13] 
 */

import java.util.Arrays;
import java.util.Scanner;

public class day5_prob3 {

    private static void insertionSort(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
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

        insertionSort(arr, n);
    }
}
