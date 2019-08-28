import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String month = scanner.nextLine().toLowerCase();
        int nights = Integer.parseInt(scanner.nextLine());

        double aptPrice = 0.00;
        double studioPrice = 0.00;

        switch (month) {
            case "may":
            case "october":
                aptPrice = nights * 65;
                studioPrice = nights * 50;
                if (nights > 14){
                    studioPrice *= (1 - 0.3);
                    aptPrice *= (1 - 0.1);
               }
                else if (nights > 7)
                    studioPrice *= (1 - 0.05);
                break;
            case "june":
            case "september":
                aptPrice = nights * 68.70;
                studioPrice = nights * 75.20;
                if (nights > 14){
                    studioPrice *= (1 - 0.2);
                    aptPrice *= (1 - 0.1);
                }
                break;
            case "july":
            case "august":
                aptPrice = nights * 77;
                studioPrice = nights * 76;
                if (nights > 14)
                    aptPrice *= (1 - 0.1);
                break;
        }

        System.out.printf("Apartment: %.2f lv.%n" +
                "Studio: %.2f lv.", aptPrice, studioPrice);
    }
}