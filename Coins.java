/* Program Name:Coin Change Program
Student Name: Judah
Student ID: 000694365 
NetID: Jbenjam7
Description: Converts time given in Seconds into quarters, nikels, dimes, pennies 
*/
import java.util.Scanner;
class ElapsedSeconds {
   public static void main(String[] args) {
   
    // variables that allow us to be able to tell how much each part is valued at
    int Totalcoins, quarters,dimes,nickels,pennies;
   
    // scanner that lets us interact with the person viewing the code 
     Scanner s = new Scanner(System.in);
   
     //  asks the user for how many coins/ change they have 
      System.out.print("Enter the amount of change (0-99):");
      Totalcoins = s.nextInt();

      // closes scanner (apparently for security)
      s.close();

    /*calculations or specifications on how much each "coin"
     is worth according to the change put into the code  */ 
     quarters = Totalcoins / 25;
     dimes = (Totalcoins % 25) / 10;
     nickels = ((Totalcoins % 25) % 10) / 5;
     pennies = ((Totalcoins % 25) % 10) % 5;

    // Print the formatted output
    System.out.format(" Number of quarters: %d\n Number of dimes: %d\n Number of nickels: %d\n Number of pennies: %d\n", quarters, dimes, nickels, pennies);

  
    
   }
}