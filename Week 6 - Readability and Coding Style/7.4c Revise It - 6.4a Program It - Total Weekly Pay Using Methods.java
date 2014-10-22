/* 
 * 7.4c Revise It (6.4a Program It) - Total Weekly Pay Using Methods
 * by Victor Lourng
 */

import java.util.Scanner;
import java.io.*;

public class WeeklyPayMethods {

  public static double HourlyWage;
  public static double HourlyOvertimeWage;
  public static double TotalNormalHours;
  public static double TotalOvertimeHours;
  public static double WeeklyPay;
  public static double WeeklyOvertimePay;
  public static double TotalWeeklyPay;

  public static void main(String[] args) {
   // New Scanner
    Scanner input = new Scanner(System.in);

    System.out.println("Weekly Pay Calculator");

   // Call statements
    GetHourlyWage();
    GetDailyHours();
    CalculateWeeklyPay();
    PrintResults();
    
  }
  
  public static void GetHourlyWage()
  {
   // New Scanner
    Scanner input = new Scanner(System.in);

   // Ask for normal hourly wage
      System.out.println("What is your normal hourly wage?");
      HourlyWage = input.nextDouble();
      
   // Calculate overtime wage at 1.5x
      HourlyOvertimeWage = 1.5 * HourlyWage;
      System.out.println("Your overtime wage is " + HourlyOvertimeWage + ".");
  }
  
  public static void GetDailyHours()
  {
   // New Scanner
    Scanner input = new Scanner(System.in);

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
      
   // Expose only total hours
      TotalNormalHours = MondayHours + TuesdayHours + WednesdayHours + ThursdayHours + FridayHours + SaturdayHours + SundayHours;
      TotalOvertimeHours = MondayOvertimeHours + TuesdayOvertimeHours + WednesdayOvertimeHours + ThursdayOvertimeHours + FridayOvertimeHours + SaturdayOvertimeHours + SundayOvertimeHours;

  }
  
  public static void CalculateWeeklyPay()
  {
   // New Scanner
    Scanner input = new Scanner(System.in);
  
   // Calculate total weekly hours      
      System.out.println("Your have worked a total of " + TotalNormalHours + " normal hours and " + TotalOvertimeHours + " overtime hours this week.");

   // Calculate total weekly pay
      WeeklyPay = (TotalNormalHours) * (HourlyWage);
      WeeklyOvertimePay = (TotalOvertimeHours) * (HourlyOvertimeWage);

      TotalWeeklyPay = WeeklyPay + WeeklyOvertimePay;
  }
  
  public static void PrintResults()
  {
   // New Scanner
    Scanner input = new Scanner(System.in);

   // Display results
    System.out.println("You should be paid " + TotalWeeklyPay + " dollars this week.");
      System.out.println("This breaks down to " + WeeklyPay + " in normal hours and " + WeeklyOvertimePay + " in overtime hours");
  }
  
}