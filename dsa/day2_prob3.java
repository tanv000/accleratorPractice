/*
 * .Given a string, print the frequency of each character.
 input: str = "programming"
 output: 
 p -> 1
 r -> 2
 o -> 1
 g -> 2
 a -> 1
 m -> 2
 i -> 1
 n -> 1
 */

import java.util.HashMap;
import java.util.Scanner;

public class day2_prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < str.length(); i++)
        {
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i),0) + 1);
        }
        System.out.println(hm);
    }
}
