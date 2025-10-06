/*
 *  Given an array of integers, print all duplicate elements. 
Input Example: 
arr = [1, 2, 3, 1, 2] 
Output Example: 
Duplicates: 1 2 
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class day4_prob4 {

    private static void duplicates(int[] arr, int n) {
        System.out.print("Duplicates: ");
        HashSet<Integer> hs = new HashSet<>();
        hs.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (hs.contains(arr[i])) {
                System.out.print(arr[i] + " ");
            } else {
                hs.add(arr[i]);
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        duplicates(arr, n);
    }
}
