package Arrays;

public class _1_3_URLify {
    public static void main(String[] args) {
        String input = "Mr John Smith   "; // output = 'Mr%20John%20Smith'
        System.out.println(uRLify(input));
    }

    public static String uRLify(String s) {
//        s = s.trim();
        return s.trim().replaceAll("\\s","%20");
    }


}
