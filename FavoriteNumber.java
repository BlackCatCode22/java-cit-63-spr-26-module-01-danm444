
import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your favorite number: ");
        int favNum = scanner.nextInt();
        System.out.println("wow, " + favNum + " is a great number!");
        scanner.close();
    }
}
