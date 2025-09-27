/*
 * Given a stream of lowercase characters, print the first non-repeating character at each point in the stream. If none exists, print -1.
 Input: aabc
 Output: a -1 b b
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class day3_adv2 {

    public static void firstNonRepeat(String str)
    {
        int[] freq = new int[26] ;
        Queue<Character> q = new LinkedList<>();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
            q.add(ch);
            
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1)
            {
                q.poll();
            }

            if(q.isEmpty())
            {
                System.out.print("-1 ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        firstNonRepeat(str);
    }
}
