// Example 2.2: inputs degrees Fahrenheit 
// from the keyboard and outputs degrees Celsius

import java.util.Scanner;

public class Convert{


   public static void main(String [] args){
   	
      Scanner reader = new Scanner(System.in);
      double fahrenheit;
      double celcius;
      double kelvin;
      
      System.out.print("Enter degrees fahrenheit: ");
      fahrenheit = reader.nextDouble();
      
      celcius = (fahrenheit - 32.0) * 5.0 / 9.0;
      
      kelvin = celcius + 273;
      
      
      
      System.out.print("The equivalent in kelvin is ");
      System.out.println(kelvin);     
   }
}
