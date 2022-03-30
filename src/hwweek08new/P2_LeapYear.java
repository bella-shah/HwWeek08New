package hwweek08new;

import java.util.Scanner;
/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class P2_LeapYear {
  public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter the year :");
         new P2_LeapYear();
        P2_LeapYear leapYear = new P2_LeapYear();
        //Clsing the scanner object
        scr.close();
    }
    //checking is it leap year or not
    public void isItLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The Year "+ year + " is leap year");
            return;
        }
    }
}
