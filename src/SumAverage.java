/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

    /**
     * Computes sum of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return sum of integers
     */
    public static int sum(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Computes sum of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return sum of integers
     */
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int h : numbers) {
            sum += h;
        }
        return sum;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return average of integers
     */
    public static double average(int lowerBound, int upperBound) {
        double sum = 0;
        double counter =0;
        double  avarage = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
            counter++;
        }
        avarage = sum/counter;
        return avarage;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return average of integers
     */
    public static double average(int[] numbers) {
        int counter = 0;
        double sum = 0.0;
        double avarage = 0;
        do {
            sum += numbers[counter];
            counter++;
        } while (counter < numbers.length);
        avarage = sum / numbers.length;
        return avarage;
    }
}