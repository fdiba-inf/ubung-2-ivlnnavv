package exercise2 ;

import java.util.Scanner;

public class Circle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 int radius=input.nextInt();

double Circumference=(Math.PI*2*radius);
double Area=(Math.PI*radius*radius);
System.out.println (" Circumference= " + Circumference);
System.out.println ("Area= " + Area);
  }
  }