import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine().toLowerCase();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double payment = 0.00;

        if (kmPerMonth <= 5000){
            switch (season){
                case "spring":
                case "autumn":
                    payment = kmPerMonth * 0.75 * 4;
                    break;
                case "summer":
                    payment = kmPerMonth * 0.90 * 4;
                    break;
                case "winter":
                    payment = kmPerMonth * 1.05 * 4;
                    break;
            }
        }

        else if (kmPerMonth <= 10000){
            switch (season){
                case "spring":
                case "autumn":
                    payment = kmPerMonth * 0.95 * 4;
                    break;
                case "summer":
                    payment = kmPerMonth * 1.10 * 4;
                    break;
                case "winter":
                    payment = kmPerMonth * 1.25 * 4;
                    break;
            }
        }

        else if (kmPerMonth <= 20000)
            payment = kmPerMonth * 1.45 * 4;

        payment *= 0.90;

        System.out.printf("%.2f", payment);
    }
}