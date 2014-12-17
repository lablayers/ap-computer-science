/*
 * Vowels-R-Us
 * 14.1 Focus On
 * by Victor Lourng
 * 
 * The project described below is from the American Computer Science League which
 * was used in one of their early competitions.  The project demands careful reading
 * and understanding of the task at hand.  It also brings together a great many skills
 * we have developed since the beginning of the course.
 * 
 * Among these are: reading from an external data file, using loops, using conditional
 * branching, designing our own methods and using the String class.  Be advised that you
 * will need to develop a careful design before you begin this project.  You also may need
 * to review earlier material on reading from an external data file. 
 * 
 * A data file will be provided for test purposes.  
 */
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.StringTokenizer;

public class VowelsRUs {

	  public static void main(String[] args) throws IOException  {
		  
		  // File location
		  String path = "/Volumes/Stashable 1/VHSJava/VowelsRUs/src/vowels.txt";
		  		  
   	      // TODO: Split these into methods

		  // Split lines
		  Scanner scanner = new Scanner(new File(path));

		  // For each line...
		  while (scanner.hasNextLine()) {
			  
			// Get line content
		    String line = scanner.nextLine();
		    String pluraled = line;
		    String suffixed = line;

		    String word = line.substring(line.lastIndexOf(" ")-1);
		    String suffix = line.substring(line.lastIndexOf(" ")+1);

		    // Get line length
		    int lineLength = line.length();

			// Find plural

			// Get last letters
			String lastLetter = line.substring((lineLength-1) , (lineLength));
			String lastTwoLetters = line.substring((lineLength-2) , (lineLength));
			
			// Regex for consonants
			String regex = ".*[acsl]$";
			if (lastTwoLetters.equals(regex)) {
				// TODO: || and != for last 2 letters
			} else if (lastLetter.equals(regex)) {
				pluraled = line + "GH";
			} else {
				// TODO: drop final vowel and add G
				pluraled = line + "G";
			}
			
			// Find suffix
			
			// Get first letters
			String firstLetter = line.substring(0,1);
			String firstTwoLetters = line.substring(0,2);

			
			// Print original line
			System.out.println("Original String: " + line);

			System.out.println("         Plural: " + pluraled);
			System.out.println("         Suffix: " + suffixed);
		  }
		  scanner.close();
	  }

}
