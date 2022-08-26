/**
 * Write a function that takes an array of numbers and returns the sum of the
 * numbers. The numbers can be negative or non-integer. If the array does not
 * contain any numbers then you should return 0.
 */

public class SumArrays {
    public static void main(String[] args) {
        double arr[] = new double[] { 2.0, 2.1, 2.2 };
        System.out.println(sum(arr));
    }

    public static double sum(double[] numbers) {
        // return Arrays.stream(numbers).sum();

        if (numbers.length == 0) {
            return 0.0;
        } else {
            double sumNum = 0;
            for (double d : numbers) {
                sumNum += d;
            }
            return sumNum;
        }
    }
}