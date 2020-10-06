// (Compute the volume of a cylinder) Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas:
// area = radius * radius * p volume = area * length

import java.util.Scanner;

public class ComputeTheVolumeOFaCylinder {
  public static void main(String[] args) {
    final double pi = 3.14159;
    Scanner input = new Scanner(System.in);
    System.out.print("What is the radius? ");
    double radius = input.nextDouble();
    System.out.print("What is the length? ");
    double length = input.nextDouble();
    System.out.println("The volume of cylinder is " + radius * radius * pi * length);
  }
}
