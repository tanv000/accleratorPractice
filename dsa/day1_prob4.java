/*Search for an element x in an array using linear search.
 input: arr = [4, 2, 9, 1, 7], x = 9
 output: Element found at index 2
 Hint for Students
 Loop through array and check if any element equals x.
 */

import java.util.Scanner;

public class day1_prob4 {

    public static int findInd(int[] arr, int x)
    {
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        System.out.println("Element found at index "+findInd(arr, x));
    }
}
