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
	  	// File location (user configurable)
	  	String path = "/Volumes/Stashable/VHSJava/VowelsRUs/src/vowels.txt";
	  	
	  	// Read file and run program
	  	runProgram(path);
	}
	  
	private static void runProgram(String path) throws IOException {
	  	// Read file
	  	Scanner scanner;
		try {
			scanner = new Scanner(new File(path));
		  	while (scanner.hasNextLine()) {	
				// Get line content
				String line = scanner.nextLine();
				
				// Confirm that there are only 2 spaces in each line, one for word separation and another for newline.
				assert (line.split(" ").length) == 2;
				   
				// Get and print results for each line
				getAndPrintResults(line);
			}
			scanner.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Error: file not found!");
			e.printStackTrace();
		}
	}
	
	private static void getAndPrintResults(String line) {
		// Get results
		String pluraled = getPlural(line);
		String suffixed = getSuffix(line, pluraled);

		// Print original line
		System.out.println(" Original String : " + line);

		// Print results
		System.out.println("          Plural : " + pluraled);
		System.out.println("          Suffix : " + suffixed);
	}
	private static String getPlural(String line) {
		return "lol";
	}
	private static String getPlural(String line) {
	    // Split line into initial word, where word is the content before the first space
	    String word = line.substring(0,line.lastIndexOf(" "));

	    // Get last two letters of word
		String wordLastLetter = word.substring((word.length()-1) , (word.length()));
		String wordSecondToLastLetter = word.substring((word.length()-2) , (word.length()-1));

		// Regular expression matching for vowels
		String vowels = ".*[ACSLacsl]$";

		// Ends in 2 or more vowels/consonants
		if (wordLastLetter.matches(vowels) && wordSecondToLastLetter.matches(vowels)) {
			// Double last letter then add "H"
			return word + wordLastLetter + "H";
		}
		else if (!wordLastLetter.matches(vowels) && !wordSecondToLastLetter.matches(vowels)) {
			// Double last letter then add "H"
			return word + wordLastLetter + "H";
		}
		// Ends in a single vowel
		else if (wordLastLetter.matches(vowels)) {
			// Drop final vowel (last letter) and add "G"
			return word.substring(0,(word.length()-1)) + "G";
		}
		// Ends in a single consonant
		else if (!wordLastLetter.matches(vowels)) {
			// Add "GH"
			return word + "GH";
		}
		// The program shouldn't reach this point.
		else {
			System.out.println("There was an error finding the plural for this line.");
			return null;
		}
	}

	private static String getSuffix(String line, String pluraled) {
	    // Split line into initial suffix, where suffix is the content after the first space
	    String suffix = line.substring(line.lastIndexOf(" ")+1);
	    // Split line into initial word, where word is the content before the first
	    String word = line.substring(0,line.lastIndexOf(" "));

	    // Get last two letters of word
		String wordLastLetter = word.substring((word.length()-1) , (word.length()));
		String wordSecondToLastLetter = word.substring((word.length()-2) , (word.length()-1));

		// Get first letter of suffix
		String suffixFirstLetter = suffix.substring(0,1);

		// Regular expression matching for vowels
		String vowels = ".*[ACSLacsl]$";

		if (wordLastLetter.matches(vowels) && wordSecondToLastLetter.matches(vowels)) {
			// If suffix starts with a vowel, add the first letter of the suffix, then add the suffix
			if (suffixFirstLetter.matches(vowels)) {
				return word + suffixFirstLetter + suffix;
			}
			// If suffix starts with a consonant, drop the leftmost letter of the final sequence of vowels, then add the suffix
			else {
				for (int i=word.length(); i>0; i--) {
					String wordCharacter = word.substring((i-1),i); 
					if (!wordCharacter.matches(vowels)) {
						return word.substring(0,i) + word.substring((i+1),word.length()) + suffix;
					}
				}
			}
		}
		else if (!wordLastLetter.matches(vowels) && !wordSecondToLastLetter.matches(vowels)) {
			// If suffix starts with a vowel, add the first letter of the suffix, then add the suffix
			if (suffixFirstLetter.matches(vowels)) {
				return word + suffixFirstLetter + suffix;
			}
			// If suffix starts with a consonant, drop the leftmost letter of the final sequence of consonants, then add the suffix
			else {
				for (int i=(word.length()); i>0; i--) {
					String wordCharacter = word.substring((i-1),i); 
					if (wordCharacter.matches(vowels)) {
						return word.substring(0,i) + word.substring((i+1),word.length()) + suffix;
					}
				}
			}

		}
		// Ends in a single vowel
		else if (wordLastLetter.matches(vowels)) {
			// If suffix starts with a vowel, drop the first letter of the suffix and add the rest of the suffix
			if (suffixFirstLetter.matches(vowels)) {
				return word + suffix.substring(1,(suffix.length()));
			}
			// If suffix starts with a consonant, add the first letter of the suffix and then add the suffix
			else {
				return word + suffixFirstLetter + suffix;
			}
		}
		// Ends in a single consonant
		else if (!wordLastLetter.matches(vowels)) {
			// Add the suffix
			return word + suffix;
		}
		// The program shouldn't reach this point.
		else {
			System.out.println("There was an error finding the consonant for this line.");
			return null;
		}
		return null;
	}

}
