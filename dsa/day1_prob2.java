/*Given an array, find the maximum and minimum elements.
 input:
 arr = [10, 5, 20, 8, 2]
 output:
 Min: 2
 Max: 20
 Hint for Students
 Iterate once → keep track of current min and max.
 */

import java.util.*;

public class day1_prob2 {

    public static int[] findMinMax(int start, int end, int[] a, int[] res)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < end; i++)
        {
            if(min > a[i])
            {
                min = a[i];
            }
            if(max < a[i])
            {
                max = a[i];
            }
        }
        res[0] = min;
        res[1] = max;
        return res;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = new int[2];
        findMinMax(0, n, arr, res);
        System.out.println("Min: "+res[0]+"\nMax: "+res[1]);
    }
}
