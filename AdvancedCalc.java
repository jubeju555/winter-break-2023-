/* Program Name:Switch Program
Student Name: Judah
Student ID: 000694365 
NetID: Jbenjam7
Description: asks the user to input a number then an operator then another number in that specific order, then calculates it. basically a level 1.5 - 2 calculator ;) 
*/
import java.util.Scanner;

class AdvancedCalc {
    public static void main(String[] args) {
        // declares the types of variables they are like ints or strings 
        int left, right;
        String operator;

        // opens scanner 
        Scanner s = new Scanner(System.in);

        // asks user to place integers and then an operator in the middle in a format
        System.out.println("Enter <left> <op> <right>:");
      
        // takes the input in the order given and (i think initializes it?)
        left = s.nextInt();
        operator = s.next();
        right = s.nextInt();
    
        // saftey
        s.close();
    
        // ok so this sets the result to 0 so that it starts from nothing and you can add other things to it 
        int result = 0;
    
        // the "operator" used to be result because thats what we did in class but the error i got made me change it - dunno why 
        switch(operator) {
         // different oporators from the math library    
         case "+":
                result = left + right;
                System.out.println(left + " + " + right + " = " + result );
                break;
            
            case "-":
                result = left - right;
                System.out.println(left + " - " + right + " = " + result );
                break;
            
            case "*":
                result = left * right;
                System.out.println(left + " * " + right + " = " + result );
                break;
            
            case "%":
                result = left % right;
                System.out.println(left + " % " + right + " = " + result );
                break;
            
            case "/":
                if (right != 0) {
                    result = left / right;
                    System.out.println(left + " / " + right + " = " + result );
                } else {
                    System.out.println("you cant divide by 0!" );
                }
                break;
            
            case "^":  
                result = (int) Math.pow(left, right);
                System.out.println(left + " ^ " + right + " = " + result );
                break;
            // basically if something is imput that the code isnt ready for it just outputs "Invalid operator!"
            default:
                System.out.println("Invalid operator!");
        }

    }
}
