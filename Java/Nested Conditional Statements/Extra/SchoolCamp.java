import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine().toLowerCase();
        String groupType = scanner.nextLine().toLowerCase();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        String sport = null;
        double price = 0.00;

        switch (season){
            case "winter":
                switch (groupType){
                    case "boys":
                        sport = "Judo";
                        price = students * 9.60;
                        break;
                    case "girls":
                        sport = "Gymnastics";
                        price = students * 9.60;
                        break;
                    case "mixed":
                        sport = "Ski";
                        price = students * 10;
                        break;
                }
                break;
            case "spring":
                switch (groupType){
                    case "boys":
                        sport = "Tennis";
                        price = students * 7.20;
                        break;
                    case "girls":
                        sport = "Athletics";
                        price = students * 7.20;
                        break;
                    case "mixed":
                        sport = "Cycling";
                        price = students * 9.50;
                        break;
                }
                break;
            case "summer":
                switch (groupType){
                    case "boys":
                        sport = "Football";
                        price = students * 15;
                        break;
                    case "girls":
                        sport = "Volleyball";
                        price = students * 15;
                        break;
                    case "mixed":
                        sport = "Swimming";
                        price = students * 20;
                        break;
                }
        }

        price *= nights;

        if (students >= 50)
            price *= 0.50;

        else if (students >= 20)
            price *= 0.85;

        else if (students >= 10)
            price *= 0.95;

        System.out.printf("%s %.2f lv.", sport, price);
    }
}