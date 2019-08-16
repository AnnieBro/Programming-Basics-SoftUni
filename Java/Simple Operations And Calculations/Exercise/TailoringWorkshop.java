import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double areaTablecloth = num * (length + 2 * 0.30) * (width + 2 * 0.30);
        double areaSquare = num * (length/2) * (length/2);
        double dollars = areaTablecloth * 7 + areaSquare * 9;
        double leva = dollars * 1.85;

        System.out.printf("%.2f USD%n", dollars);
        System.out.printf("%.2f BGN", leva);
    }
}
