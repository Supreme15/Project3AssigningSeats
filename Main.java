import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    String[] names = new String[15];

    for (int i = 0; i <= names.length; i++) {
      System.out.println("Name please");

      while (i++ < seats.length) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        name += scan.nextLine();
        System.out.println("\n Hello " + name + ", please sit in seat #" + i);
        System.out.println("\n Name please \n");
      }
    }
  }
}