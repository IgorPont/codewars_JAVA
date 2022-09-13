public class StringUtils {
    public static String toAlternativeString(String str) {
        char[] chars = str.toCharArray();
        str = "";
        for (char c : chars) {
            if (Character.isLowerCase(c))
                c = Character.toUpperCase(c);
            else
                c = Character.toLowerCase(c);
            str += c;
        }
        return str;
    }
}
