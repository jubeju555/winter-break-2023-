import java.util.Scanner;
class Event{

    public static void main(String[] args) {
        
        // Creates a scanner 
        Scanner s = new Scanner(System.in);
        double b;
        
        // asks how much money is allocated for the event
        System.out.println("what is the budget for your event?");
        b = s.nextDouble();
        
        // formats the budget given and goes to 2 decimals
       

        // gives the overall budget
        System.out.format("Budget: %12.2f%n",b);

        // how much the venue would cost out of budget
        System.out.format("Venue: %12.2f%n",b * .5);

        // how much the food would cost out of budget
        System.out.format("Food: %12.2f%n",b * .2);

        // how much the Florals would cost out of budget
        System.out.format("Florals: %12.2f%n",b * .1);

        // this is how much you have left over 
        System.out.format("Excess: %12.2f%n",b * .2);

        /*Contact info - firstname left justified, 20 spaces wide
        and the last name is right justified */

        System.out.format("Photographer: %-5s %5s%n", "anne", "smith");

        String fn = "Elizabeth allison";
        String ln = "Barrington";

        System.out.format("Photographer: %-5s %5s", fn, ln);

        s.close();
        


        }
    }