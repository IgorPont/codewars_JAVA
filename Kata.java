/*
 * imple, given a string of words, return the length of the shortest word(s)
 */

public class Kata {

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));

    }

    public static int findShort(String s) {
        String[] words = s.split(" ");
        int minLen = words[0].length();
        String minWrd = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < minWrd.length()) {
                minWrd = words[i];
                minLen = words[i].length();

            }
        }
        return minLen;

        // return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}