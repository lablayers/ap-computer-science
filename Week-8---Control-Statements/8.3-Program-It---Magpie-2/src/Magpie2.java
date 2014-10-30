/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative? :-(";
		}
		else if (statement.indexOf("yes") >= 0)
		{
			response = "Yay! :-D";
		}
		else if (statement.indexOf("maybe") >= 0)
		{
			response = "Oh really? Pick a side! :-?";
		}
		else if (statement.indexOf("exist") >= 0)
		{
			response = "I exist for however long you want me to. ;-)";
		}
		else if (statement.indexOf("name") >= 0)
		{
			response = "Nice to meet you! I'm Magpie. ;-)";
		}
		else if (statement.indexOf("nuzzle") >= 0)
		{
			response = "*nuzzles back* :-B";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("mom") >= 0
				|| statement.indexOf("dad") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family. :-O";
		}
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0)
		{
			response = "Tell me more about your pets. :-O";
		}
		else if (statement.indexOf("Nelson") >= 0
				|| statement.indexOf("Yuka") >= 0)
		{
			response = "She sounds like good teacher. :-)";
		}
		else if (statement.length() < 1)
		{
			response = "Say something, please. ;-P";
		}
		else if (statement.indexOf("Athos") >= 0
				|| statement.indexOf("Porthos") >= 0
				|| statement.indexOf("Aramis") >= 0)
		{
			response = "Ah, the three musketeers. Love them! /-)";
		}
		else if (statement.indexOf("weather") >= 0
				|| statement.indexOf("sunny") >= 0
				|| statement.indexOf("cloudy") >= 0
				|| statement.indexOf("wind") >= 0
				|| statement.indexOf("rain") >= 0
				|| statement.indexOf("hot") >= 0
				|| statement.indexOf("cold") >= 0
				|| statement.indexOf("mild") >= 0
				|| statement.indexOf("cool") >= 0)
		{
			response = "Weather nerd! '-)";
		}
		else if (statement.indexOf("dinosaurs") >= 0
				|| statement.indexOf("floppy") >= 0
				|| statement.indexOf("tamagotchi") >= 0)
		{
			response = "They don't make things like these any more. :-/";
		}
		else if (statement.indexOf("happy") >= 0
				|| statement.indexOf("awesome") >= 0
				|| statement.indexOf("great") >= 0)
		{
			response = "Glad to hear! I'm doing awesome as well. :-D";
		}
		else if (statement.indexOf("sad") >= 0
				|| statement.indexOf("cry") >= 0
				|| statement.indexOf("worried") >= 0)
		{
			response = "I'm sorry to hear that. :'(";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more. :-O";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm. :-O";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so? :-O";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say. :-O";
		}
		else if (whichResponse == 4)
		{
			response = "Can you tell me more? :-O";
		}
		else if (whichResponse == 5)
		{
			response = "Sounds fascinating! :-D";
		}
		else if (whichResponse == 6)
		{
			response = "Cool. Now make make me a sandwich! :-[";
		}
		return response;
	}
}
