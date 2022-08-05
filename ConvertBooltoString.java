/**
 * Implement a function which convert the given boolean value into its string
 * representation.
 * Note: Only valid inputs will be given.
 */

// public class BooleanToString {
// public static String convert(boolean b) {
// if (b == true) {
// return "true";
// } else {
// return "false";
// }
// }
// }

public class ConvertBooltoString {
    public static String convert(boolean b) {
        return b ? "true" : "false";
    }

    public static void main(String[] args) {
        boolean b = false;
        System.out.println(convert(b));

    }
}