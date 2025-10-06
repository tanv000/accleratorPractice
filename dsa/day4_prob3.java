/*
 * You are given an array of size n-1 containing distinct numbers from 1 to n. 
Find the missing number in the sequence. 
Input Example: 
arr = [1, 2, 4, 5] 
n = 5 
Output Example: 
3
 */
import java.util.Scanner;

public class day4_prob3 {

    private static void findMissingNum(int[] arr, int n)
    {
        int expSum = (n * (n+1))/2;
        int sum = 0;
        for(int i : arr)
        {
            sum += i;
        }

        System.out.println(expSum - sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];

        for(int i = 0; i < n - 1; i++)
        {
            arr[i] = sc.nextInt();
        }

        findMissingNum(arr, n);
    }
}
