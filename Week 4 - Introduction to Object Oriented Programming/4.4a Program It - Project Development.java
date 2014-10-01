/* 
 * 4.4a Program It
 * by Victor Lourng
 * https://github.com/lablayers
 */
 
import java.util.Scanner;
import java.io.*;
 
public class Main {
  public static void main(String[] args) {
 
    // New Scanner
 
      Scanner input = new Scanner(System.in);
 
    // Project 2.1:
 
      System.out.println("Write a program that displays your name, address, and telephone number.");
 
      System.out.println("Hey, my name is Victor Lourng.");
      System.out.println("I just me you and this is crazy.");
      System.out.println("So here's my number, call me maybe?");
      System.out.println("Here you go: +1 (571)969-1778");
      System.out.println("And some address for good measure: 85 Buffalo Lane, Nowhere, OK, 73038.");
 
      System.out.println("---------------------------------------");
 
    // Project 2.2:
 
      System.out.println("A yield sign that encloses the world YIELD within a triangle.");
 
      System.out.println("*");
      System.out.println("*    *");
      System.out.println("*        *");
      System.out.println("*            *");
      System.out.println("*                *");
      System.out.println("*                    *");
      System.out.println("*                        *");
      System.out.println("*                            *");
      System.out.println("*                                *");
      System.out.println("*                                    *");
      System.out.println("*                                        *");
      System.out.println("*   __   __  ___   _______  ___      ______  * ");
      System.out.println("*  |  | |  ||   | |       ||   |    |      |     * ");
      System.out.println("*  |  |_|  ||   | |    ___||   |    |  _    |        *");
      System.out.println("*  |       ||   | |   |___ |   |    | | |   |            *");
      System.out.println("*  |_     _||   | |    ___||   |___ | |_|   |                *");
      System.out.println("*    |   |  |   | |   |___ |       ||       |                    *");
      System.out.println("*    |___|  |___| |_______||_______||______|                         *");
      System.out.println("*                                                                        *");
      System.out.println("*****************************************************************************");
 
      System.out.println("---------------------------------------");
 
    // Project 2.3:
 
      System.out.println("Write a program that converts kilometers into nautical miles.");
 
      double Kilometers = 0;
      double NauticalMiles = 0;
 
      System.out.print("How many kilomenters do you want to convert into nautical miles?");
 
      Kilometers = input.nextDouble();
 
      NauticalMiles = Kilometers; 
      NauticalMiles /= 10000; // North Pole and Equator distance in Kilometers
      NauticalMiles *= 90;    // 90 degrees between North Pole and Equator 
      NauticalMiles *= 60;    // 60 minutes of arc per degree
 
      // Alternative one-line version -> NauticalMiles = (Kilometers * 5400) / 10000;
 
      System.out.println("There are " + NauticalMiles + " nautical miles in "+ Kilometers + " kilometers.");
 
      System.out.println("---------------------------------------");
 
    // Project 2.4:
 
      System.out.println("Write a program that calculates and prints the number of minutes in a year.");
      
      // A double variable allows for decimal points, so values like 3.5 years are supported.
      double Years = 0;
      // Math variable for precise double math operations instead of Seconds for accuracy (see comment below)
      double Math  = 0;
      
      System.out.print("How many years do you want to convert into seconds?");
 
      Years = input.nextDouble();
 
      Math = Years;
      Math *= 365; // 1 Year = 365 Days
      Math *= 24;  // 1 Day = 24 Hours
      Math *= 60;  // 1 Hour = 60 Minutes
      Math *= 60;  // 1 Minute = 60 Seconds
 
      // Convert double Math into ingeger Seconds because whole numbers make sense for this context.
      // Source: http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html
      int Seconds = (int)Math;
 
      // Alternative one-line version -> Seconds = (Years * 31536000);
 
      System.out.println("There are " + Seconds + " seconds in " + Years + " years.");
 
      System.out.println("---------------------------------------");
 
  }
}