/* 
 * 7.5 Problem Set - Java Doc Scavenger Hunt
 * by Victor Lourng
 */

import java.util.Scanner;
import java.io.*;

public class SevenPointFiveProblemSet {
  
    public static void main(String[] args) {
     // New Scanner
        Scanner input = new Scanner(System.in);

     // Part 1: Working examples of Math class methods

     // abs(double a)
        System.out.println("The absolute value of 86.56 is " + Math.abs(86.56));
        System.out.println("The absolute value of -512.3 is " + Math.abs(-512.3));

    // ceil(double a)
       System.out.println("The ceiling (round up) of 86.56 is " + Math.ceil(86.56));
       System.out.println("The ceiling (round up) of -512.3 is " + Math.ceil(-512.3));

     // floor(double a)
        System.out.println("The floor (round down) of 86.56 is " + Math.floor(86.56));
        System.out.println("The floor (round down) of -512.3 is " + Math.floor(-512.3));

     // max(int a, int b)
        System.out.println("The highest value of 86.56 and -512.3 is " + Math.max(86.56, -512.3));
        System.out.println("The highest value of 2 and 64.61 is " + Math.max(2, 64.61));

     // min(int a, int b)
        System.out.println("The lowest value of 86.56 and -512.3 is " + Math.min(86.56, -512.3));
        System.out.println("The lowest value of 2 and 64.61 is " + Math.min(2, 64.61));

     // Part 2: Working examples of String class methods

     // indexOf(int ch)
        System.out.println("Index of test is " + String.indexOf(65));

     // length()
        System.out.println("The length of 'steak' " + String.indexOf("steak"));
        System.out.println("The length of 'apple pie' " + String.indexOf("apple pie"));

     // isEmpty()
        System.out.println("Is '' empty?  " + String.isEmpty(''));
        System.out.println("Is 'steak' empty?  " + String.isEmpty("steak"));
        System.out.println("Is 'apple pie' empty?  " + String.isEmpty("apple pie"));

     // substring(int beginIndex, int endIndex)
        String str = "the quick brown fox jumped over the lazy dog";
        System.out.println("The first characters of 'the quick brown fox jumped over the lazy dog' are " + str.substring(0, 7));

     // replace(char oldChar, char newChar)
        System.out.println("Replacing 'o' with 'e': " + Char.replace(o, e));

    }

}
