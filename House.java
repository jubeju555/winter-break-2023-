public class House
{
  private double price;
  private int squareFootage;
  private int numBedrooms;
  private int numBathrooms;

  public House(int p, int size, int beds, int baths)
  {
    price = p;
    squareFootage = size;
    numBedrooms = beds;
    numBathrooms = baths;
  }

  public double getPrice()
  {
    return price;
  }

  public double getSquareFootage()
  {
    return squareFootage;
  }

  public double getNumBedrooms()
  {
    return numBedrooms;
  }

  public double getNumBathrooms()
  {
    return numBathrooms;
  }

  public void printInfo()
  {
    String cirInfo = squareFootage + " sqft house with " + numBedrooms + " bedrooms and "
        + numBathrooms + " bathrooms for $" + ((int) price);
    System.out.println(cirInfo);
  }

  public void changePrice(double changeAmount) {
    price = price + changeAmount;
  }

  public int calcDownPayment(int percent)
  {
    int downPayment = (int) (price * percent);
    return downPayment;
  }
}