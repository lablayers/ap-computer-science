/*
 * Word-O-Matic
 * 13.4a Program It (Project 7.8 - Page 282)
 * by Victor Lourng
 * 
 * Write a program that uses a scanner to report some statistics about words in an input
 * sentence (see Section 7.8). The outputs should be the number of words in the sentence,
 * the average word length, and the length of the sentence.
 */
import java.util.Scanner;
import java.util.Random;

public class WordOMatic {
	
   public static void main (String [] args) {
	   
      Scanner reader = new Scanner(System.in);
      
      String input;
      int count = 0;
      double sum = 0;
      double average = 0;

      System.out.println("What is the magic string?");
      input = reader.nextLine();

      System.out.println(input);
      
      for (String word : input.split("\\s+")){
          count++;
          sum = sum + word.length();
      }
      
      sum = sum / count;

      System.out.println(count + " words long");
      System.out.println(sum + " average word length");
      System.out.println(input.length() + " characters long");
      
   }
   
}
