// (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total. 

import java.util.Scanner;

public class FinalAppCalculateTips {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("How much is your product rate? ");
    double rate = input.nextDouble();
    System.out.println("Your total is $" + (rate * 1.15));
  }
}
