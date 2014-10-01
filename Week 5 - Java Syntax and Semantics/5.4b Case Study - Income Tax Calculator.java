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


import java.util.Scanner;

public class IncomeTaxCalculator{

   public static void main(String [] args){
   
      // Constants
      final double TAX_RATE = 0.20;
      final double STANDARD_DEDUCTION = 10000.0;
      final double DEPENDENT_DEDUCTION = 2000.0;
      
      Scanner reader = new Scanner(System.in);
      
      double grossIncome;          // the gross income (input)
      int    numDependents;        // the number of dependents (input)
      double taxableIncome;        // the taxable income (calculated)
      double incomeTax;            // the income tax (calculated and output)
      

      // Request the inputs
      System.out.print("Enter the gross income: ");
      grossIncome = reader.nextDouble();
      System.out.print("Enter the number of dependents: ");
      numDependents = reader.nextInt();
      

      // Compute the income tax
      taxableIncome = grossIncome - STANDARD_DEDUCTION - 
                      DEPENDENT_DEDUCTION * numDependents;
      incomeTax = taxableIncome * TAX_RATE;
      
      // Display the income tax
      System.out.println("The income tax is $" + incomeTax);
   }
}
