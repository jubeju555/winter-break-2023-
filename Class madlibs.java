package Class;

import java.util.Scanner;
class madlibs{
    public static void main(String[] args) {
        String animal, noun1, noun2, noun3, noun4, verb; 
        Scanner inputdevice = new Scanner(System.in);
        //gather the blanks in the Mad libs game
        System.out.print("give me an animal:");
        animal = inputdevice.nextLine();
        System.out.println("you entered " + animal);
        
        System.out.print("give me an noun:");
        noun1 = inputdevice.nextLine();

        System.out.print("give me an noun:");
        noun2 = inputdevice.nextLine();

        System.out.print("give me an noun:");
        noun3 = inputdevice.nextLine();

        System.out.print("give me an noun:");
        noun4 = inputdevice.nextLine();
        // print smelly cat song with new words 
        System.out.println("smelly  " +  animal  + "smelly  " +  animal );
        System.out.println("what are they feeding you?" );
        System.out.println("smelly  " +  animal  + "smelly  " +  animal );
        System.out.println("its not your " + noun1);
        System.out.println("they wont take you to the vet");
        System.out.println("System.out.printf");
        System.out.println("you may not be a bed of roses ");
        System.out.println("you re not friends to those with noses");
    }
}
/*smelly __ , smelly __ 
what are they feeding you?
smelly __ , smelly __ 
its not your fault!

they wont take you to the vet 
youve obviously not their favorite pet 
you may not be a bed of roses 
you re not friends to those with noses*/
