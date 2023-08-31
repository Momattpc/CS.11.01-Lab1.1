import java.util.Scanner;

public class Dateable {
    public static void main(String[] args) {
      System.out.println("(please note that all odd numbers are rounded DOWN)");
      Scanner scanner1 = new Scanner(System.in);
      System.out.println("What is your age? (No trolling please)");
      int userAge = scanner1.nextInt();

      int daterAge = (userAge / 2);
      int daterAgeRounded = (Math.round(daterAge) + 7);
      System.out.println( userAge + "-year olds should date someone who is at least" + " " + daterAgeRounded + " " + "years old");

    }
}
