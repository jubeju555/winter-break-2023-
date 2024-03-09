/* Program Name:Elapsed seconds 
Student Name: Judah
Student ID: 000694365 
NetID: Jbenjam7
Description: Converts time given in Seconds into Hours, min, and seconds 
*/
import java.util.Scanner;
class ElapsedSeconds {
   public static void main(String[] args) {
    // declares all the variables used for the program  
    int dataInSeconds, hours, minutes, seconds;

      Scanner s = new Scanner(System.in);

      // Asks the person how much time has gone be in seconds  
      System.out.print("Enter the elapsed time in seconds: ");
      dataInSeconds = s.nextInt();
// closes scanner (apparently for security)
      s.close();

      /* tells the computer how much each variable is worth in terms of seconds */

      hours =   dataInSeconds / 3600;
      minutes = (dataInSeconds % 3600) / 60;
      seconds = dataInSeconds % 60; 
// prints out recalculated measurments of times formated from hour to minutes to seconds 
      System.out.format(dataInSeconds  + " seconds is %d hours, %d minutes, %d seconds.",hours, minutes, seconds);         
      
   }
}