package hwweek08new;

import java.util.Scanner;
/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class P12_FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scr.next().charAt(0);
        //Object creation
        P12_FindInputValue inputValue = new P12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //Closing the scanner object
        scr.close();
    }

    // Find the input value is ALPHABET, DIGIT and SYMBOL
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT.");
        } else {
            System.out.println(ch + " is a SYMBOL.");
        }
    }
}

