/*Case study 1: an income tax calculator
Compute a person's income tax.
1) Significant constants
       tax rate
       standard deduction
       deduction per dependent
2) The inputs are:
       gross income 
       number of dependents 
3) Computations:
       net income = gross income - the standard deduction - 
                    a deduction for each dependent 
       income tax = is a fixed percentage of the net income 
4) The outputs are:
       the income tax.
*/

// Imports the Scanner class from the util package
import java.util.Scanner;

// Creates the class IncomeTaxCalculator
public class IncomeTaxCalculator{

  // Creates a method called main
  public static void main(String [] args){
   
      // Constants
      // There is a flat tax rate of 20%
      final double TAX_RATE = 0.20;
      // There is a $10,000 standard deduction
      final double STANDARD_DEDUCTION = 10000.0;
      // There is a $2,000 standard deduction for each dependent
      final double DEPENDENT_DEDUCTION = 2000.0;
      
      // This will allow you to read input from the console 
      Scanner reader = new Scanner(System.in);
      
      // Variables
      // Creates a variable for the gross income (input)
      double grossIncome;
      // Creates a variable called number of dependents, must be a whole number (input)
      int    numDependents;
      // Creates a varaible for the taxable income (calculated)
      double taxableIncome;
      // Creates a variable for the income tax (calculated and output)
      double incomeTax;
      
      // Request the inputs
      // Asks for gross income
      System.out.print("Enter the gross income: ");
      // Stores the gross income in the double
      grossIncome = reader.nextDouble();
      // Asks for the number of dependents
      System.out.print("Enter the number of dependents: ");
      // Stores the number of dependents in the double
      numDependents = reader.nextInt();
      
      // Compute the income tax
      // Calculates taxable income as:
      // gross income - 10000 (stadard deduection) - 2000 * number of dependents
      taxableIncome = grossIncome - STANDARD_DEDUCTION - 
                      DEPENDENT_DEDUCTION * numDependents;
      // Calculates the income tax as:
      // taxable income * 20% (tax rate)
      incomeTax = taxableIncome * TAX_RATE;
      
      // Display the income tax
      // Prints "The income tax is $" + incometax
      System.out.println("The income tax is $" + incomeTax);
   }
}