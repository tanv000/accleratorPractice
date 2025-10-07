/*
 * Implement Bubble Sort to sort an array of integers in ascending order. 
Input Example: 
arr = [5, 1, 4, 2] 
Output Example: 
[1, 2, 4, 5]
 */
import java.util.Arrays;
import java.util.Scanner;

public class day5_prob1 {

    private static void bubbleSort(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
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

        bubbleSort(arr, n);
    }
}
