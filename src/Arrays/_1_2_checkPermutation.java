/*  Given two Strings, write a method to decide if one is a permutation of the other. */

package Arrays;
import java.util.HashMap;

public class _1_2_checkPermutation {
    public static void main(String[] args) {
        String[][] testCases = {
                {"ABCDE", "ACDEB"}, // True case
                {"ABEFCDE", "ACDEBOP"}, // False case
                {"hello", "oellh"}, // True case
                {"java", "avaj"}, // True case
                {"java", "cavaj"} // False Case
        };

        for (String[] testCase : testCases) {
            String s1 = testCase[0];
            String t1 = testCase[1];
            System.out.println(checkPermutation(s1, t1));
        }
    }

    public static boolean checkPermutation(String s1, String t1) {
        if (s1.length() != t1.length()) {
            return false;
        }
        return countString(s1).equals(countString(t1));
    }

    public static HashMap<Character, Integer> countString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
