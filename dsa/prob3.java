/*Check if a given string is a palindrome (reads same forward and backward).
 input: str = "madam"
 output: Palindrome
 Hint for Students
 Compare characters from both ends.
 */

import java.util.Scanner;

public class prob3 {

    public static boolean isPalin(int start, int end, String str)
    {
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
        if(isPalin(0, str.length() - 1, str))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
