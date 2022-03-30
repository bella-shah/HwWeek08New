package hwweek08new;

import java.util.Scanner;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class P16_FindPositiveNegative {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scr.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //Closing the scanner object
        scr.close();
    }

    // Finding the number is Positive Negative or Zero
    public static void findNumberIsPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + " is a POSITIVE number");
        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE number");
        } else {
            System.out.println(number + " is ZERO");
        }
    }
}

