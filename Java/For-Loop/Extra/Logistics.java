import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.nextLine());

        int totalTons = 0;
        double totalAverage = 0.0;
        double microbus = 0.0;
        double truck = 0.0;
        double train = 0.0;

        for (int i = 0; i < amount; i++) {
            int tons = Integer.parseInt(scanner.nextLine());

            if (tons <= 3) {
                totalAverage += tons * 200;
                microbus += tons;
            }

            else if (tons <= 11) {
                totalAverage += tons * 175;
                truck += tons;
            }

            else {
                totalAverage += tons * 120;
                train += tons;
            }

            totalTons += tons;
        }

        totalAverage /= totalTons;
        microbus /= totalTons;
        truck /= totalTons;
        train /= totalTons;

        System.out.printf("%.2f%n" +
                "%.2f%%%n" +
                "%.2f%%%n" +
                "%.2f%%%n", totalAverage, microbus * 100, truck * 100, train * 100);
    }
}
