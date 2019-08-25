import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine()) - 1;
        String room = scanner.nextLine().toLowerCase();
        String review = scanner.nextLine().toLowerCase();

        switch (room){
            case "room for one person":
                switch (review){
                    case "positive":
                        System.out.printf("%.2f", days * 18.00 * (1 + 0.25));
                        break;
                    case "negative":
                        System.out.printf("%.2f", days * 18.00 * (1 - 0.10));
                        break;
                }
                break;

            case "apartment":
                switch (review){
                    case "positive":
                        if(days < 10)
                            System.out.printf("%.2f", days * 25.00 * (1 - 0.30) * (1 + 0.25));
                        else if(days >= 10 && days <= 15)
                            System.out.printf("%.2f", days * 25.00 * (1 - 0.35) * (1 + 0.25));
                        else
                            System.out.printf("%.2f", days * 25.00 * (1 - 0.50) * (1 + 0.25));
                        break;
                    case "negative":
                        if(days < 10)
                            System.out.printf("%.2f", days * 25.00 * (1 - 0.30) * (1 - 0.10));
                        else if(days >= 10 && days <= 15)
                            System.out.printf("%.2f", days * 25.00 * (1 - 0.35) * (1 - 0.10));
                        else
                            System.out.printf("%.2f", days * 25.00 * (1 - 0.50) * (1 - 0.10));
                        break;
                }
                break;

            case "president apartment":
                switch (review){
                    case "positive":
                        if(days < 10)
                            System.out.printf("%.2f", days * 35.00 * (1 - 0.10) * (1 + 0.25));
                        else if(days >= 10 && days <= 15)
                            System.out.printf("%.2f", days * 35.00 * (1 - 0.15) * (1 + 0.25));
                        else
                            System.out.printf("%.2f", days * 35.00 * (1 - 0.20) * (1 + 0.25));
                        break;
                    case "negative":
                        if(days < 10)
                            System.out.printf("%.2f", days * 35.00 * (1 - 0.10) * (1 - 0.10));
                        else if(days >= 10 && days <= 15)
                            System.out.printf("%.2f", days * 35.00 * (1 - 0.15) * (1 - 0.10));
                        else
                            System.out.printf("%.2f", days * 35.00 * (1 - 0.20) * (1 - 0.10));
                        break;
                }
                break;
        }
    }
}
