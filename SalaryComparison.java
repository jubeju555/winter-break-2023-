/* Program Name:Using Objects Program
Student Name: Judah
Student ID: 000694365 
NetID: Jbenjam7
Description: calculates the amounted that should be allocated from your salary for different catagories 
*/
import java.util.Scanner;
class SalaryComparison {

    public static void main(String[] args) {
        // creates scanner 
        Scanner s = new Scanner(System.in);
        // varianbles for both salires to be input into program
        int salaryInput1, salaryInput2;
        
        // asks for the salar of the uses first job and saves it for futher use through scanner 
        System.out.print("Enter the salary for the first job (no commas): $");
        salaryInput1 = s.nextInt();
        // same thing as 2 lines above but saves it for uses second job
        System.out.print("Enter the salary for the second job (no commas): $");
        salaryInput2 = s.nextInt();
       // closes scanner (saftey)
        s.close();

       

        // honestly im not sure i think im creating a object from the class of budget
        Budget job1 = new Budget(salaryInput1);
        Budget job2 = new Budget(salaryInput2);
        // uses a object from budget and applies it to job 1 and 2 
        job1.calculateTHP();
        job2.calculateTHP();

        // calculates and assignemt appropriate amount of salary form job1 to each catagory of spending
        double needs = job1.calculateBudgetCategory(50); 
        double wants = job1.calculateBudgetCategory(30); 
        double savings = job1.calculateBudgetCategory(20);
        //formats the allocation of each part of the salary for needs,wants,and savings for job 1
    System.out.format("Monthly Take Home Salary for Job 1: $%.2f\n", job1.getMonthlyTakeHomePay());
        System.out.format("By the 50/30/20 Budget, spend up to $%.2f on needs (Food, shelter, etc)\n", needs);
        System.out.format("                        spend up to $%.2f on wants (Hobbies, travel, etc)\n", wants);
        System.out.format("                        and up to   $%.2f on savings (retirement, emergency fund)\n", savings);

        // calculates and assignemt appropriate amount of salary form job2 to each catagory of spending
        needs = job2.calculateBudgetCategory(50); 
        wants = job2.calculateBudgetCategory(30);
        savings = job2.calculateBudgetCategory(20);
        //formats the allocation of each part of the salary for needs,wants,and savings for job 2
        System.out.format("Monthly Take Home Salary for Job 2: $%.2f\n", job2.getMonthlyTakeHomePay());
        System.out.format("By the 50/30/20 Budget, spend up to $%.2f on needs (Food, shelter, etc)\n", needs);
        System.out.format("                        spend up to $%.2f on wants (Hobbies, travel, etc)\n", wants);
        System.out.format("                        and up to   $%.2f on savings (retirement, emergency fund)\n", savings);
    }
}