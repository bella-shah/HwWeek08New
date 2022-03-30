package hwweek08new;

import java.util.Scanner;
/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */

public class P9_CityNameWithSwitch {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        String city = scr.next().toUpperCase();
        //Create object and call instance method
        P9_CityNameWithSwitch cityName = new P9_CityNameWithSwitch();
        cityName.printCityName(city);
        //Closing the scanner object
        scr.close();
    }

    //Printing city name
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
    }
}




