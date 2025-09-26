/*
 * Rotate an array arr by k positions to the right.
 input:arr = [1, 2, 3, 4, 5, 6, 7], k = 3
 output: [5, 6, 7, 1, 2, 3, 4]
 */

import java.util.Arrays;
import java.util.Scanner;

public class day2_prob2 {

    public static int[] rotate(int[] arr, int k)
    {
        int start = 0, end = arr.length - 1;
        while(start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        start = 0;
        end = k - 1;
        while(start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        start = k;
        end = arr.length - 1;
        while(start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int  k= sc.nextInt();
        System.out.println(Arrays.toString(rotate(arr, k)));
    }
}
