package hwweek08new;

import java.util.Scanner;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */

public class P6_OddEven {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scr = new Scanner (System.in);
        System.out.println("Enter the number you want to check :");
        int number = scr.nextInt();
        P6_OddEven oddEven = new P6_OddEven();
        System.out.println(number + " is" + oddEven.isItEvenOrOddNumber(number) + "number");
        //Closing the scanner object
        scr.close();
    }
    //Checking the odd or even
    public String isItEvenOrOddNumber(int number){
        if (number % 2 == 0){
            return "Even";
        }else{
            return "Odd";

        }
    }
}
