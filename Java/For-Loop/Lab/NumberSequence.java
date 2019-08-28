import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());
        int min = number;
        int max = number;

        for (int i = 1; i < n; i ++) {
            number = Integer.parseInt(scanner.nextLine());
            if (number < min)
                min = number;
            if (number > max)
                max = number;
        }

        System.out.printf("Max number: %d%n" +
                "Min number: %d", max, min);
    }
}
