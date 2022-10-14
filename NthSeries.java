import java.text.DecimalFormat;

/**
 * 1 --> 1 --> "1.00"
 * 2 --> 1 + 1/4 --> "1.25"
 * 5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"
 */

public class NthSeries {
    public static void main(String[] args) {
        System.out.println(seriesSum(5));

    }

    public static DecimalFormat df2 = new DecimalFormat("0.00");

    public static String seriesSum(int n) {
        if (n <= 1) {
            double result = n;
            String res = "" + df2.format(result);
            return res;
        } else {
            int div = 4;
            float tmp = 0;
            for (int i = 1; i < n; i++) {
                tmp += 1f / div;
                div += 3;
            }
            tmp = 1 + tmp;
            String res = "" + df2.format(tmp);
            return res;

        }

    }

}