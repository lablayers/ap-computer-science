/*
 * LuckySevensReloaded.java
 * 12.4a Program It (Project 7.6 - Page 281)
 * by Victor Lourng
 * 
 * Instructions: Review the case study in Chapter 4 in which the Lucky Sevens gambling game program was
 * created. Remove the code that deals with the maximum amount held. Then modify the program
 * so that it runs the simulation 100 times and prints the average number of rolls.
 * 
 * Original File: LuckySevens.java
 * Simulate the game of lucky sevens until all funds are depleted.
 * 1) Rules:
 *         roll two dice
 *         if the sum equals 7, win $4, else lose $1
 * 2) The inputs are:
 *         the amount of money the user is prepared to lose 
 * 3) Computations:
 *         use the random number generator to simulate rolling the dice
 *         loop until the funds are depleted 
 *         count the number of rolls
 *         keep track of the maximum amount (removed)
 * 4) The outputs are:
 *         the number of rolls it takes to deplete the funds
 *         the maximum amount (removed)
*/ 
import java.util.Scanner;
import java.util.Random;

public class LuckySevensReloaded {
   public static void main (String [] args) {
  
      Scanner reader = new Scanner(System.in);
      Random generator = new Random();
   
      int die1, die2,       // two dice
          dollars,          // initial number of dollars (input)
          dollarsPerLoop,   // 
          count,            // number of rolls to reach depletion
          totalCount,       // total count
          averageCount;		// average count
          // countAtMax;    // count when the maximum is achieved

	  // Initialize variables
      count = 0;
      totalCount = 0;
      averageCount = 0;
      
      // Request the input
      System.out.print("How many dollars do you have? ");
      dollarsPerLoop = reader.nextInt();

      // Loop 100 times
      for (int i=1; i <= 100; i++) {
    	  
    	  // System.out.println("INCREMENT " + i);

    	  // Initialize variables with each loop
    	  dollars = dollarsPerLoop;
          // System.out.println("start dollars: " + dollars);

          count = 0;

          // Loop until the money is gone   
          while (dollars > 0){
             count++;
         
             // Roll the dice.
             die1 = generator.nextInt (6) + 1; // 1-6 
             die2 = generator.nextInt (6) + 1; // 1-6
         
             // Calculate the winnings or losses
             if (die1 + die2 == 7) {
                dollars += 4;
             }
             else {
                dollars -= 1; 
             }
          
          }
         
         // Money is now gone
         // System.out.println("end dollars: " + dollars);
         // System.out.println("count: " + count);
         
         // Add number of rolls to total count of rolls
         totalCount = totalCount + count;
         // System.out.println("totalCount: " + totalCount);
         
      }
   
      // Divide total count of rolls by 100 for an average
      averageCount = totalCount / 100;
      
      // Display the results
      System.out.println("You are broke after an average of " + averageCount + " rolls.\n");
   }
}