import java.util.Scanner;

public class NumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        while (num < 1 || num > 100) {
            System.out.println("Invalid number!");
            num = Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("The number is: %d", num);
    }
}
