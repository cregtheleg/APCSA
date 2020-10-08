import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Please Enter your name: ");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    System.out.println("Hello " + name);
    scan.close();
  }
}