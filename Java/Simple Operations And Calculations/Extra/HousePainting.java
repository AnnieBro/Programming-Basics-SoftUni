import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double greenPaint = (x * x * 2) + (x * y * 2) - (1.2 * 2) - (1.5 * 1.5 * 2);
        double redPaint = (x * y * 2) + (x * h);

        System.out.printf("%.2f%n%.2f", greenPaint/3.4, redPaint/4.3);
    }
}
