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

public class VowelsRUSNoMethods {

	  public static void main(String[] args) throws IOException  {
		  
		  // File location
		  String path = "/Volumes/Stashable/VHSJava/VowelsRUs/src/vowels.txt";
		  
		  // Enable line comments for debugging  
	      Boolean debug = true;
 
   	      // TODO: Split these into methods

		  // Split lines
		  Scanner scanner = new Scanner(new File(path));

		  // For each line...
		  while (scanner.hasNextLine()) {
			
			
			// Get line content
		    String line = scanner.nextLine();
		    String pluraled = line;
		    String suffixed = line;
		    
		    // Confirm that there are only 2 spaces in each line, one for word separation and another for newline.
		    assert (line.split(" ").length) == 2;

		    // Get word
		    String word = line.substring(0,line.lastIndexOf(" "));
		    String suffix = line.substring(line.lastIndexOf(" ")+1);

		    // Get line length
		    int lineLength = line.length();
		    int wordLength = word.length();
		    int suffixLength = suffix.length();

			// Find plural
			// Get last two letters of word
			String wordLastLetter = word.substring((wordLength-1) , (wordLength));
			String wordSecondToLastLetter = word.substring((wordLength-2) , (wordLength-1));
			String wordLastTwoLetters = word.substring((wordLength-2) , (wordLength));
			
			// Find suffix
			// Get first two letters of suffix
			String suffixFirstLetter = suffix.substring(0,1);
			// String suffixSecondLetter = suffix.substring(1,2);
			// String suffixFirstTwoLetters = suffix.substring(0,2);

			// TODO: Check if suffix starts with consonant or vowel
			
			// Regular expression matching for vowels
			String vowels = ".*[ACSLacsl]$";
			// Ends in 2 or more vowels/consonants
			if (wordLastLetter.matches(vowels) && wordSecondToLastLetter.matches(vowels)) {
				if (debug == true) System.out.println("[D] Ends in 2 or more vowels: " + word);
				// Double last letter then add "H"
				pluraled = word + wordLastLetter + "H";
				// If suffix starts with a vowel, add the first letter of the suffix, then add the suffix
				if (suffixFirstLetter.matches(vowels)) {
					suffixed = word + suffixFirstLetter + suffix;
				}
				// If suffix starts with a consonant, drop the leftmost letter of the final sequence of vowels, then add the suffix
				else {
					for (int i=wordLength; i>0; i--) {
						String wordCharacter = word.substring((i-1),i); 
						if (wordCharacter.matches(vowels)) {
							System.out.println("[D] Word Character #" + i + ", " + wordCharacter + " is a vowel.");
						}
						else {
							System.out.println("[D] Word Character #" + i + ", " + wordCharacter + " is a consonant.");
							suffixed = word.substring(0,i) + word.substring((i+1),wordLength) + suffix;
							break;
						}
					}
				}
			}
			else if (!wordLastLetter.matches(vowels) && !wordSecondToLastLetter.matches(vowels)) {
				if (debug == true) System.out.println("[D] Ends in 2 or more consonants: " + word);
				// Double last letter then add "H"
				pluraled = word + wordLastLetter + "H";
				// If suffix starts with a vowel, add the first letter of the suffix, then add the suffix
				if (suffixFirstLetter.matches(vowels)) {
					suffixed = word + suffixFirstLetter + suffix;
				}
				// If suffix starts with a consonant, drop the leftmost letter of the final sequence of consonants, then add the suffix
				else {
					for (int i=wordLength; i>0; i--) {
						String wordCharacter = word.substring((i-1),i); 
						if (!wordCharacter.matches(vowels)) {
							System.out.println("[D] Word Character #" + i + ", " + wordCharacter + " is a consonant.");
						}
						else {
							System.out.println("[D] Word Character #" + i + ", " + wordCharacter + " is a vowel.");
							suffixed = word.substring(0,i) + word.substring((i+1),wordLength) + suffix;
							break;
						}
					}
				}

			}
			// Ends in a single vowel
			else if (wordLastLetter.matches(vowels)) {
				if (debug == true) System.out.println("[D] Ends in a single vowel: " + word);
				// Drop final vowel (last letter) and add "G"
				pluraled = word.substring(0,(wordLength-1)) + "G";
				// If suffix starts with a vowel, drop the first letter of the suffix and add the rest of the suffix
				if (suffixFirstLetter.matches(vowels)) {
					suffixed = word + suffix.substring(1,suffixLength);
				}
				// If suffix starts with a consonant, add the first letter of the suffix and then add the suffix
				else {
					suffixed = word + suffixFirstLetter + suffix;
				}
			}
			// Ends in a single consonant
			else if (!wordLastLetter.matches(vowels)) {
				if (debug == true)  System.out.println("[D] Ends in a single consonant: " + word);
				// Add "GH"
				pluraled = word + "GH";
				// Add the suffix
				suffixed = word + suffix;
			}
			// The program shouldn't reach this point.
			else {
				System.out.println("There was an error reading this line.");
				break;
			}
			// Print original line
			System.out.println(" Original String : " + line);
			
			if (debug == true) System.out.println("[D]         Word : " + word);
			if (debug == true) System.out.println("[D]       Suffix : " + suffix);

			if (debug == true) System.out.println("[D]  wLastLetter : " + wordLastLetter);
			if (debug == true) System.out.println("[D]  wSecoLetter : " + wordSecondToLastLetter);
			if (debug == true) System.out.println("[D] wLastLetters : " + wordLastTwoLetters);
			
			if (debug == true) System.out.println("[D] sFirstLetter : " + suffixFirstLetter);
			// if (debug == true) System.out.println("[D]  sSecoLetter: " + suffixSecondLetter);
			// if (debug == true) System.out.println("[D]sFirstLetters: " + suffixFirstTwoLetters);

			System.out.println("          Plural : " + pluraled);
			System.out.println("          Suffix : " + suffixed);
			
			if (debug == true) System.out.println("==================");

		  }
		  scanner.close();
	  }

}
