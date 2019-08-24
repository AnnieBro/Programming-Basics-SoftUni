import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        int Z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double grape = X * Y;
        double wine = grape * 0.4 / 2.5;
        double difference = Math.abs(wine - Z);

        if(wine >= Z)
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n" +
                    "%.0f liters left -> %.0f liters per person.",
                    Math.floor(wine), Math.ceil(difference),
                    Math.ceil(difference / workers));
        else
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",
                    Math.floor(difference));
    }
}
