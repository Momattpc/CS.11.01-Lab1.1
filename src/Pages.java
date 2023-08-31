import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        System.out.println("(please note that all odd numbers are rounded DOWN");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What is your age? (No trolling please)");
        int userAge = scanner1.nextInt();
    if (userAge > 100)
        System.out.println("If you're over 100, go enjoy life while it still lasts!");
    else if (userAge == 100)
        System.out.println("Congrats! Instead of reading, you can work on writing your will!");
    else if (userAge < 100) {
        int pagesRead = (100 - userAge);
        System.out.println( "As you are " + userAge + "," + " " + "you should read at least " + pagesRead + " pages before giving up on a book (and going to sleep) .");
    }

    }
}
