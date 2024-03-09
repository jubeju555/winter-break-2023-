import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        int monthInt = 10;
        int dayInt = 4;
        int yearInt = 2022;
        String dayString;  // monday, tuesday, etc

        // Determining the day of the week algorithm can go here
        
        int d0 = 0; // For example, assuming the day of the week is Sunday

        switch(d0) {
            case 0:
                dayString = "Sunday";
                break;
            case 1:
                dayString = "Monday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            default:
                dayString = "Error";
        }

        System.out.println(monthInt + "/" + dayInt + "/" + yearInt + " is a " + dayString);
    }
}
