/**
 * Given an array of integers your solution should find the smallest integer.
 * For example:
 * Given [34, 15, 88, 2] your solution will return 2
 * Given [34, -345, -1, 100] your solution will return -345
 * You can assume, for the purpose of this kata, that the supplied array will
 * not be empty.
 */

public class SmallestIntegerFinder {
    // public static int findSmallestInt(int[] args) {
    // int min = args[0];
    // for (int i = 1; i < args.length; i++) {
    // if (args[i] < min) {
    // min = args[i];
    // }
    // }
    // return min;

    // }

    public static int findSmallestInt(int[] args) {
        int smallest = Integer.MAX_VALUE;
        for (int i : args)
            smallest = (smallest > i) ? i : smallest;
        return smallest;
    }

    public static void main(String[] args) {
        int[] arg = new int[] { 34, -345, -1, 100 };
        System.out.println(findSmallestInt(arg));
    }

}
