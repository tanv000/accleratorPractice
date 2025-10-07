/*
 * Implement Bubble Sort to sort an array of integers in ascending order. 
Input Example: 
arr = [5, 1, 4, 2] 
Output Example: 
[1, 2, 4, 5]
 */

import java.util.Arrays;
import java.util.Scanner;

public class day5_prob2 {

    private static void selectionSort(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            int minInd = i;
            
            for(int j = i+1; j < n; j++)
            {
                if(arr[j] < arr[minInd])
                {
                    minInd = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
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
        selectionSort(arr, n);
    }
}
