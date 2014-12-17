/* 13.4b Revise It
 * Solution to Project 3.5
   Compute an employee's total weekly pay
   Useful facts
     An employee's total weekly pay equals the
     hourly wage multiplied by the total number
     of regular hours plus any overtime pay.  Overtime
     pay equals the total overtime hours multiplied by 1.5
     times the hourly wage.  Write a program that takes as
inputs the hourly wage, total regular hours, and total
overtime hours for each of five days and displays an employee's
total weekly pay.
*/
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TotalWeeklyPayReReloadedUsingStringMethods {
	
	  // variables necessary for file input
	  private static FileInputStream inFile;
	  private static InputStreamReader inReader;
	  private static  BufferedReader reader;

	  //  StringTokenizer variable used to separate line into different data elements
	  private static StringTokenizer strTkn;

	  // program variables to hold data
	  private static String line, word;
	  private static String firstname, lastname;
	  private static double totalRegHours, totalOverHours, regularHours, overtimeHours, wage, totalPay;
	  
	  // throws IOException will have the operating system handle any problems
	  // that may occur while

	  
	  // throws IOException will have the operating system handle any problems
	  // that may occur while attempting to acquired data from the file.
	  
	  public static void main (String args[]) throws IOException
	  {

	    initFile();  
	    getData();
	    calcTotal();
	    printResults();
	    funFacts();

	    // closing the data file
	    inFile.close();
	  }
	  
	 
	 // preparing the file for input
	 
	  public static void initFile() throws IOException
	  {
	    inFile = new FileInputStream ("VHSP35data1.txt"); // this is a unix path
	    inReader = new InputStreamReader(inFile);
	    reader = new BufferedReader(inReader);
	  }
	  
	  
	  //data acquisition method
	  
	  public static void getData() throws IOException
	  {
	    line = reader.readLine();   //acquiring the data line as a string
	    System.out.println ("data line = " + line ); // view data line as one string
	    System.out.println();
	    
	    strTkn = new StringTokenizer(line);  // attaching the string tokenizer to the line
	    
	    // placing the first word in the dataline into a string variable    
	    firstname = strTkn.nextToken();
	     
	    // extracting the parts of the line into separate int and double variables
	    lastname = strTkn.nextToken();
	    
	    // totalRegHours, totalOverHours, regularHours, overtimeHours, wage, totalPay
	    wage = Double.parseDouble(strTkn.nextToken());
	    // Mon
	    totalRegHours = Double.parseDouble(strTkn.nextToken());
	    totalOverHours = Double.parseDouble(strTkn.nextToken());
	    // Tue
	    totalRegHours = totalRegHours + Double.parseDouble(strTkn.nextToken());
	    totalOverHours = totalOverHours + Double.parseDouble(strTkn.nextToken());
	    // Wed
	    totalRegHours = totalRegHours + Double.parseDouble(strTkn.nextToken());
	    totalOverHours = totalOverHours + Double.parseDouble(strTkn.nextToken());
	    // Thu
	    totalRegHours = totalRegHours + Double.parseDouble(strTkn.nextToken());
	    totalOverHours = totalOverHours + Double.parseDouble(strTkn.nextToken());
	    // Fri
	    totalRegHours = totalRegHours + Double.parseDouble(strTkn.nextToken());
	    totalOverHours = totalOverHours + Double.parseDouble(strTkn.nextToken());
	  }  

	public static void calcTotal() {
      totalPay = totalRegHours * wage + totalOverHours * wage * 1.5;
   }
	
	public static void printResults() {
      System.out.println(firstname + " " + lastname + "'s weekly total pay is " + totalPay + " dollars.");
   }
	
	public static void funFacts() {
      System.out.println("Fun Facts:");
      System.out.println(firstname + " contains " + firstname.length() + " letters");
      System.out.println("The 5th character in " + firstname + " is " + firstname.charAt(4));
      System.out.println("K replaced with D in " + firstname + " is " + firstname.replace('K', 'D'));
      System.out.println("The 2nd-5th characters in " + firstname + " is " + firstname.substring(1, 4));
      if (firstname.equalsIgnoreCase("kermit")){
    	  System.out.println(firstname + " matches 'kermit', non-case sensetive.");
      }
      else {
    	  System.out.println(firstname + " does not match 'kermit', non-case sensetive.");
      }
      System.out.println(lastname + " in uppercase letters is " + lastname.toUpperCase());
      System.out.println(lastname + " in lowercase letters is " + lastname.toLowerCase());
      if (firstname.equals(lastname)){
    	  System.out.println("This person has the exact same first and last name");
      }
      else {
    	  System.out.println("This person has a different first and last name");
      }
      System.out.println("The letter 'o' in " + lastname + " is in character " + (lastname.indexOf('o') + 1));
      System.out.println(lastname + " with leading/trailing spaces removed is " + lastname.trim() + " - there are none!");
      
   }


}
