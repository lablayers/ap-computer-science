/* 
 * Code based from 10.4a Propose It
 * by Victor Lourng
 */

import java.util.Random;
import java.util.Scanner;
import java.io.*;


public class ComputerGuesses {

  // program variables to hold data
  private static int MaxRange = 100;
  private static int MinRange = 1;
  private static int Guess = 1;
  private static String UserInput;
  private static int NumberOfGuesses = 0;
  
public static void main (String args[]) {

  Scanner input = new Scanner(System.in);
  Random random = new Random();
    
  // Ask for an input on first run
  System.out.println("Think of a number between 1 - 100. Stick with it.");
  System.out.println("You will be asked a series of questions.");
  System.out.println("You must type 'lower', 'higher', or 'correct'");

  // Run until number is guessed
  while (1 == 1) {  
	  // Computer generates number between ranges
	  Guess = random.nextInt(MaxRange - MinRange + 1) + MinRange;
      System.out.println("I guess " + Guess + ".");
      System.out.println("DEBUG: MinRange is " + MinRange + ", MaxRange is " + MaxRange + ".");

      UserInput = input.next();
      // Change range accordingly
      if (UserInput.equals("lower")) {
    	  MaxRange = Guess;
	      NumberOfGuesses++;
      }
      if (UserInput.equals("higher")) {
    	  MinRange = Guess;
	      NumberOfGuesses++;
      }
      // If guess is correct
      if (UserInput.equals("correct")) {
    	  break;
      }
      if (MinRange == MaxRange) {
          break;
      }
      // Validate input
      else {
          System.out.println("Please type 'lower', 'higher', or 'correct'!");
      }
  }
  
  // Guessed number must equal number
  System.out.println("I finally found it! It's " + Guess + ".");
  
  // Display results
  System.out.println("It only took me " + NumberOfGuesses + " guesses!");

}
}
