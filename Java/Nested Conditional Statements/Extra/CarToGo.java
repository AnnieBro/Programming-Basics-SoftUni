import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();

        String quality = null;
        String car = null;
        double price = 0.00;


        if (budget <= 100){
            quality = "Economy class";
            switch (season){
                case "summer":
                    car = "Cabrio";
                    price = budget * 0.35;
                    break;
                case "winter":
                    car = "Jeep";
                    price = budget * 0.65;
                    break;
            }
        }

        else if (budget <= 500){
            quality = "Compact class";
            switch (season){
                case "summer":
                    car = "Cabrio";
                    price = budget * 0.45;
                    break;
                case "winter":
                    car = "Jeep";
                    price = budget * 0.80;
                    break;
            }
        }

        else {
            quality = "Luxury class";
            car = "Jeep";
            price = budget * 0.90;
        }

        System.out.printf("%s%n%s - %.2f", quality, car, price);
    }
}