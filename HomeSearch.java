public class HomeSearch {
    public static void main(String[] args) {
        System.out.println("abc");
       double x;
       int a, b,c;
        House cabin = new House(1650000, 2730, 3, 3);
        cabin.printInfo();

        int cabinDownPayment = cabin.calcDownPayment(5);
        System.out.println("The downpayment for my cabin is $" + cabinDownPayment);

        /* Changing the price */
        House kellyst = new House(1650000, 2730, 3, 3);
        int kellyStDP = kellyst.calcDownPayment(10);
        System.out.println("Downpayment for the kelly St cabin is $" + cabinDownPayment);
        kellyst.changePrice(-500000);
        System.out.println("the downpayment for the cabin is $" + kellyst.getPrice());
        

    }
}
