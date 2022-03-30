package hwweek08new;

import java.util.Scanner;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class P1_OddEvenTernaryOperator {
    public static void main (String[] args){
        //Scanner declaration for reading input from console
        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scr.nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object
        scr.close();
    }
    //Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number % 2 ==0)? "Even" : "odd";
        System.out.println("The"+ number + "is" + evenOrOdd+ "number");
    }
}
