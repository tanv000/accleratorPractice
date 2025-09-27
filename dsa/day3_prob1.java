/*
 * Given a string, check whether it is a palindrome (reads the same forwards and 
backwards). Ignore case
 Input: "Madam"
 */

 import java.util.Scanner;

public class day3_prob1 {

    public static boolean isPalin(int start, int end, String str)
    {
        str = str.toLowerCase();
        while(start <= end)
        {
            if(str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner  sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalin(0, str.length() - 1, str));
    }
}