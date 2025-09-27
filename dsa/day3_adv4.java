/*
 * Given an elevation map (array of heights), compute how much water it can 
trap after raining.
 Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 Output:  6
 */

import java.util.Scanner;

public class day3_adv4 {

    public static int computeWater(int[] arr) {
        int n = arr.length;
        int lMax = 0, rMax = 0, total = 0, l = 0, r = n - 1;

        while (l < r) {
            if (arr[l] <= arr[r]) {
                if (lMax > arr[l])
                    total += lMax - arr[l];
                else
                    lMax = arr[l];

                l++;
            } else {
                if (rMax > arr[r])
                    total += rMax - arr[r];
                else
                    rMax = arr[r];

                r--;
            }
        }
        return total;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(computeWater(arr));
    }
}
