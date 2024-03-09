// no package in this case 
import java.util.Scanner;

class learninginput{
    public static void main(String[] args) {
        String firstname;
        int x = 7;
        Scanner inputdevice = new Scanner(System.in);
        System.out.print("what is your name?");
       firstname = inputdevice.next();
       // System.out.println(firstname + "");
        System.out.print("your username is " + firstname + x);

        inputdevice.close();

      // remember to clase scanner 
    }
}