/* Program Name: area of a triangle 
Student Name: Judah
Student ID: 000694365 
NetID: Jbenjam7
Description: calculate the area of a triangle 
In this program, we will put comments in your code too.*/
import java.util.Scanner;
class Military{

    public static void main(String[] args) {
// Creates a scanner 
    Scanner s = new Scanner(System.in);
        int mhours, mMin;
    System.out.println("give me the hours of military time");
    mhours = s.nextInt();
    System.out.println("give me the min: ");
    mMin = s.nextInt();    
    s.close();
    
    
    
    int shours, smin;
    shours = mhours % 12; 
    smin = mMin; 
    System.out.format("the military time is  %02d:%02d " , shours,smin);

    

    }

}

