import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    //number of seats//
    String[] names = new String[15];
    //How many names there can be in this code//

    for (int i = 0; i <= names.length; i++) {
      System.out.println("Name please");

      while (i++ < seats.length) {
        //as long as the number is less than or equal to the number of strings assigned/ the code will run//
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        name += scan.nextLine();
        //looks for user input//
        System.out.println("\n Hello " + name + ", please sit in seat #" + i);
        //prints name alang with print statement and number//
        System.out.println("\n Name please \n");
      }
    }
  }
}