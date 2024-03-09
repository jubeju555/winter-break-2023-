/* Program Name: area of a triangle 
Student Name: Judah
Student ID: 000694365 
NetID: Jbenjam7
Description: calculate the area of a triangle 
In this program, we will put comments in your code too.*/
import java.util.Scanner;
class ops{

    public static void main(String[] args) {
    double b, h, area; 

// Creates a scanner 
    Scanner s = new Scanner(System.in);

    // asks for the base of the triangle
        System.out.println("enter the base of the traingle");
        b = s.nextDouble();

// asks for the height of the triangle
        System.out.println("enter the hight of the trianlge");
        h = s.nextDouble();
        // closes the scanner 
        s.close();
        // formula for aread of a triangle
        area = .5 * b * h; 

        // formats the base and the height of the triangle 
        System.out.format("give a base %.1f and height of %.1f " , b,h);
        // formats the area of the triangle 
        System.out.format("then take the aread of the triangle %.1f", area);

        

    }

}

// int/ double or double/int or double/double = doulbe as an answer
