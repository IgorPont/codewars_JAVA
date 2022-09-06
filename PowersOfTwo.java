/**
 * PowersOfTwo
 */
public class PowersOfTwo {
    public static void main(String[] args) {
        long[] array = powersOfTwo(5);
        for (long i : array) {
            System.out.printf("%d ", i);
        }

    }

    public static long[] powersOfTwo(int n) {
        long[] exp = new long[n];
        for (int i = 0; i < n; i++) {
            exp[i] = ((int) Math.pow(2, i));
        }
        exp[n - 1] = (int) Math.pow(2, n);
        return exp;
    }

}