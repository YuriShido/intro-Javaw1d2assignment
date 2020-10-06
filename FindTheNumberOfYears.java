// Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and days for the min- utes. For simplicity, assume a year has 365 days
import java.util.Scanner;

public class FindTheNumberOfYears {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the minuts. ");
    int minutes = input.nextInt();
    final int minInYear = 525600;
    final int minInday = 1440;
    int years = minutes / minInYear;
    int remainder = minutes % minInYear;
    int days = remainder / minInday;
    System.out.println(minutes + " minuts is " + years + " years and " + days + " days" );
  }
}