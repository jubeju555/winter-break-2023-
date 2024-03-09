import java.util.Scanner;
public class CarExample {
    public static void main(String[] args) {
        // making an instance of the Car class
        // i.e. making an object of type Car
        Car carObj1 = new Car(3000, 1998, "ford", "explorer");
        // You can split this up into two lines
        Car carObj2;
        carObj2 = new Car(2000, 1992, "Acura", "Integra");

         Car sassy = new Car(3000, 1998, "ford", "explorer");

        sassy.printInfo();
        sassy.setPrice(2500);


    }
}