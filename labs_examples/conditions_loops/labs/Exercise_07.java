package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        // write completed here
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a word: ");
        // assign input to variable as int
       String input = scanner.nextLine();

       int index = 0;
       char firstVowel = '\0';

       while(index < input.length()){
           char currentChar = input.charAt(index);
           if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'){
               firstVowel = currentChar;
               break;
           }
           index++;
       }
        System.out.println(firstVowel);

    }
}
