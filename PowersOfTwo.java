/**
 * PowersOfTwo
 */
public class PowersOfTwo {
    public static void main(String[] args) {
        long[] array = powersOfTwo(3);
        for (long i : array) {
            System.out.printf("%d ", i);
        }

    }

    public static long[] powersOfTwo(int n) {
        if (n == 0)
            return new long[] { 1 };
        else {
            long[] exp = new long[n + 1];
            for (int i = 0; i <= n; i++) {
                exp[i] = ((int) Math.pow(2, i));
            }
            return exp;
        }
    }

}