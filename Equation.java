/* Program Name: Input and Formatted Output
Student Name: Judah
Student ID: 000694365 
NetID: Jbenjam7
Description: Takes values and evaluates them through given formula then prints them in a specific way
In this program, we will put comments in your code too.*/
import java.util.Scanner;

class Equation {
    public static void main(String[] args) {
     // establishes variables 
      double a;
      double b;
      double c;
      double d;
      
      /* creates a scanner and asks for values to be put into equation */
      Scanner s = new Scanner(System.in);
      System.out.print("Enter four doubles (a * b - c + d): ");
      a = s.nextDouble();
      b = s.nextDouble();
      c = s.nextDouble();
      d = s.nextDouble();
     
      //closes scanner (saftey)
      s.close();

      // Formula given 
      double result = a * b - c + d;
     // Makes it so that it comes out with 2 decimals and then the result
      String formattedResult = String.format("%.2f * %.2f - %.2f + %.2f = %.2f", a,b,c,d,result);
      // Prints out the result as instructed 
      System.out.format(formattedResult);


   }
}