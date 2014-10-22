/* 
 * 6.4a Program It - Total Weekly Pay
 * by Victor Lourng
 */

import java.util.Scanner;
import java.io.*;

public class WeeklyPay {
  public static void main(String[] args) {

   // New Scanner
      Scanner input = new Scanner(System.in);
      
      System.out.println("Weekly Pay Calculator");
    
   // Ask for normal hourly wage
      System.out.println("What is your normal hourly wage?");
      double HourlyWage = input.nextDouble();
      
   // Calculate overtime wage at 1.5x
      double HourlyOvertimeWage = 1.5 * HourlyWage;
      System.out.println("Your overtime wage is " + HourlyOvertimeWage + ".");
      
   // Gather daily hours
      System.out.println("How many normal hours did you work on Monday?");
      double MondayHours = input.nextDouble();
      System.out.println("How many overtime hours did you work on Monday?");
      double MondayOvertimeHours = input.nextDouble();

      System.out.println("How many normal hours did you work on Tuesday?");
      double TuesdayHours = input.nextDouble();
      System.out.println("How many overtime hours did you work on Tuesday?");
      double TuesdayOvertimeHours = input.nextDouble();

      System.out.println("How many normal hours did you work on Wednesday?");
      double WednesdayHours = input.nextDouble();
      System.out.println("How many overtime hours did you work on Wednesday?");
      double WednesdayOvertimeHours = input.nextDouble();

      System.out.println("How many normal hours did you work on Thursday?");
      double ThursdayHours = input.nextDouble();
      System.out.println("How many overtime hours did you work on Thursday?");
      double ThursdayOvertimeHours = input.nextDouble();

      System.out.println("How many normal hours did you work on Friday?");
      double FridayHours = input.nextDouble();
      System.out.println("How many overtime hours did you work on Friday?");
      double FridayOvertimeHours = input.nextDouble();

      System.out.println("How many normal hours did you work on Saturday?");
      double SaturdayHours = input.nextDouble();
      System.out.println("How many overtime hours did you work on Saturday?");
      double SaturdayOvertimeHours = input.nextDouble();

      System.out.println("How many normal hours did you work on Sunday?");
      double SundayHours = input.nextDouble();
      System.out.println("How many overtime hours did you work on Sunday?");
      double SundayOvertimeHours = input.nextDouble();

   // Calculate total weekly hours
      double TotalNormalHours = MondayHours + TuesdayHours + WednesdayHours + ThursdayHours + FridayHours + SaturdayHours + SundayHours;
      double TotalOvertimeHours = MondayOvertimeHours + TuesdayOvertimeHours + WednesdayOvertimeHours + ThursdayOvertimeHours + FridayOvertimeHours + SaturdayOvertimeHours + SundayOvertimeHours;
      
      System.out.println("Your have worked a total of " + TotalNormalHours + " normal hours and " + TotalOvertimeHours + " overtime hours this week.");

   // Calculate total weekly pay
      double WeeklyPay = (TotalNormalHours) * (HourlyWage);
      double WeeklyOvertimePay = (TotalOvertimeHours) * (HourlyOvertimeWage);

      double TotalWeeklyPay = WeeklyPay + WeeklyOvertimePay;

    System.out.println("You should be paid " + TotalWeeklyPay + " dollars this week.");
      System.out.println("This breaks down to " + WeeklyPay + " in normal hours and " + WeeklyOvertimePay + " in overtime hours");

  }
}