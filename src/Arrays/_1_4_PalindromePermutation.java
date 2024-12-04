package Arrays;

import java.util.HashMap;

public class _1_4_PalindromePermutation {
    public static void main(String[] args) {
        String input = "Tact Coa"; // True
        String input1 = ""; // True
        String input2 = "A"; // Single String - True
        String input3 = "A man a plan a canal Panama"; // Mixed letters - True
        String input4 = "hello"; // False
        String input5 = "aaaaabbb"; // Odd inputs


        System.out.println(palindromePerm(input));
        System.out.println(palindromePerm(input1));
        System.out.println(palindromePerm(input2));
        System.out.println(palindromePerm(input3));
        System.out.println(palindromePerm(input4));
        System.out.println(palindromePerm(input5));
    }

    public static boolean palindromePerm(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);

            if(c == ' '){
                continue;
            }

            c = Character.toLowerCase(c);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else{
                map.put(c,1);
            }
        }

        boolean foundOdd = false;
        for(int count : map.values()){
            if(count % 2 != 0){
                if(foundOdd){
                return false;
                }
                foundOdd = true;
            }

        }

        return true;
    }
}
