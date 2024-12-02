/*Question: Implement an Algorithm to determine if a string has all unique characters.
 What if you cannot use additional data structures */

package Arrays;
import java.util.*;
public class _1_1_isUnique {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "abcdea";

        System.out.println(isUnique(s1));
        System.out.println(isUnique(s2));
    }


    public static boolean isUnique(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                return false;
            }
            map.put(c, i);
        }
        return true;
    }
}





