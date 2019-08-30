import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0.00;
        double p2 = 0.00;
        double p3 = 0.00;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0)
                p1 += 1;

            if (number % 3 == 0)
                p2 += 1;

            if (number % 4 == 0)
                p3 += 1;
        }

        p1 = (p1 / n) * 100;
        p2 = (p2 / n) * 100;
        p3 = (p3 / n) * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%", p1, p2, p3);
    }
}
