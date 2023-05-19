package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        int sum = 0;
        int start = 1;
        while (start <= 100){
            sum += start;
            start++;

        }
        System.out.println(sum);
    }
}
