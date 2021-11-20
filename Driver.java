public class Driver {

  static Divide divide = new Divide();
  static Dynamic dynamic = new Dynamic();

  public static void main(String[] args) {

    long start = System.nanoTime();

    System.out.println("Divide and conquer");
    for (int i = 1; i < 9; i++) {
      System.out.println(i + ": " + divide.HowManyWays(i));
    }

    long stop = System.nanoTime();
    System.out.println("Divide and conquer time: " + (stop - start) + " nanoseconds");

    System.out.println("Dynamic programming");
    start = System.nanoTime();
    for (int i = 1; i < 9; i++) {
      System.out.println(i + ": " + divide.HowManyWays(i));
    }
    stop = System.nanoTime();
    System.out.println("Dynamic programming time: " + (stop - start) + " nanoseconds");
  }
}
