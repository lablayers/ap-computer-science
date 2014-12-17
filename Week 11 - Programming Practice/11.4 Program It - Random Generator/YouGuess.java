/* 
 * Code based from 10.4a Propose It
 * by Victor Lourng
 */

import java.util.Random;
import java.util.Scanner;
import java.io.*;


public class YouGuess {

  // program variables to hold data
  private static int ActualNumber = 0;
  private static int GussedNumber = 0;
  private static int NumberOfGuesses = 0;
  
public static void main (String args[]) {

  Scanner input = new Scanner(System.in);

  // Computer generates number between 1 - 100
  Random random = new Random();
  ActualNumber = random.nextInt(100 - 1 + 1) + 1;
  
  // Ask for an input on first run
  System.out.println("I'm thinking of a numer between 1 to 100.");

  // While guessed number is wrong
  while (GussedNumber != ActualNumber) {
      GussedNumber = input.nextInt();
      // Validate input values
      if (GussedNumber > 100) {
          System.out.println("Please choose a number between 1 to 100.");
      }
      if (GussedNumber < 1) {
          System.out.println("Please choose a number between 1 to 100.");
      }
      // Message hints if input is higher/lower
      if (GussedNumber < ActualNumber) {
	      System.out.println("It's a little higher!");
	      NumberOfGuesses++;
      }
      if (GussedNumber > ActualNumber) {
	      System.out.println("It's a little lower!");
	      NumberOfGuesses++;
      }
  }
  
  // Guessed number must equal number
  System.out.println("You finally found it!");
  
  // Display results
  System.out.println("It only took you " + NumberOfGuesses + " guesses!");

}
}
