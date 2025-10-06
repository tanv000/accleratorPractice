/*
 * Given a string of parentheses ()[]{}, check whether it is balanced. 
A string is balanced if every opening bracket has a matching closing bracket in the correct 
order. 
Input Example: 
({[]}) 
Output Example: 
Balanced 
 */
import java.util.Scanner;
import java.util.Stack;

public class day4_prob2 {

    private static boolean isBalanced(String str)
    {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }
            else{
                if(st.isEmpty())    return false;
                char s = st.pop();
                if((ch == ')' && s == '(') || (ch == '}' && s == '{') || (ch == ']' && s == '['))   continue;
                else    return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isBalanced(str))
        {
            System.out.println("Balanced");
        }
        else{
            System.out.println("Unbalanced");
        }
    }
}
