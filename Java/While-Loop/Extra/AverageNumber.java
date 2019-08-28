import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double average = 0;

        for(int i = 0; i < n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            average += number;
        }

        System.out.printf("%.2f", average / n);
    }
}
