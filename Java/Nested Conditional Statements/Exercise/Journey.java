import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();

        String destination = null;
        String accommodation = null;
        double spentMoney = 0.00;

        if(budget <= 100){
            destination = "Bulgaria";
            switch (season){
                case "summer":
                    accommodation = "Camp";
                    spentMoney = budget * 0.30;
                    break;
                case "winter":
                    accommodation = "Hotel";
                    spentMoney = budget * 0.70;
                    break;
            }
        }

        else if(budget > 100 && budget <= 1000){
            destination = "Balkans";
            switch (season){
                case "summer":
                    accommodation = "Camp";
                    spentMoney = budget * 0.40;
                    break;
                case "winter":
                    accommodation = "Hotel";
                    spentMoney = budget * 0.80;
                    break;
            }
        }

        else{
            destination = "Europe";
            accommodation = "Hotel";
            spentMoney = budget * 0.90;
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", destination, accommodation, spentMoney);
    }
}