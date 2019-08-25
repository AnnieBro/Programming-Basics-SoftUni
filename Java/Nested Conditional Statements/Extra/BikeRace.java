import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String category = scanner.nextLine().toLowerCase();

        double total = 0.00;

        switch (category){
            case "trail":
                total = juniors * 5.50 + seniors * 7;
                break;
            case "cross-country":
                total = juniors * 8 + seniors * 9.50;
                if (juniors + seniors >= 50)
                    total *= (1 - 0.25);
                break;
            case "downhill":
                total = juniors * 12.25 + seniors * 13.75;
                break;
            case "road":
                total = juniors * 20 + seniors * 21.50;
                break;
        }

        total *= (1 - 0.05);

        System.out.printf("%.2f", total);
    }
}