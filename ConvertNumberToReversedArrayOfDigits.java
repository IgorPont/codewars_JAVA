/**
 * Given a random non-negative number, you have to return the digits of this
 * number within an array in reverse order.
 */

public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(int n) {
        int sizeN = Long.toString(n).length();
        int[] array = new int[sizeN];
        for (int i = 0; i < array.length; i++) {
            array[i] = n % 10;
            n = n / 10;
        }
        return array;

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
    }

    public static void main(String[] args) {
        printArray(digitize(12345));
    }

}
