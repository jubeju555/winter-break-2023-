package Class;
import java.util.Scanner;

class Triplemynumber {
    public static void main(String[] args) {
      int number1;
      double number2;
      //sets up the scanner 
      Scanner scan = new Scanner(System.in);
     
      // first prompt 
      System.out.print("type out a whole ");
      /* want to store respose in number 1 
      uses scanner and number 1 in the next line */
      number1 = scan.nextInt();
      // now triple the number that was input
      System.out.println("Triple that number");
      System.out.println(number1 * 3);

      //repeat this but with number2 which is a double

      System.out.print("type out a real number");      
      number2 = scan.nextDouble();
      //just combines lines 17 and 18 
      System.out.println("Triple that number" + number2 * 3);

      scan.close();

      
    }
}