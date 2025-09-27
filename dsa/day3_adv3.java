/*
 * Given an unsorted array of integers, find the length of the longest 
consecutive sequence.
 Input: [100, 4, 200, 1, 3, 2]
 Output: 4   (sequence is 1,2,3,4)
 */



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class day3_adv3 {

    public static int longestSeqLen(int[] arr, int n)
    {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            set.add(arr[i]);
        }

        int maxLen = 0;
        for(int i = 0; i < n; i++)
        {
            int num = arr[i];
            if(!set.contains(num - 1))
            {
                int curr = num;
                int len = 1;

                while(set.contains(curr + 1))
                {
                    curr++;
                    len++;
                }

                if(len > maxLen){
                    maxLen = len;
                }
            }
        }
        return maxLen;
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

        System.out.println(longestSeqLen(arr, n));
    }
}
