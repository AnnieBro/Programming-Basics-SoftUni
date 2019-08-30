import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());

        double other = 0.0;
        double water = 20.0;
        double internet = 15.0;
        double totalElectricity = 0.0;

        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            totalElectricity += electricity;

            other += ((electricity + water + internet) * 1.2);
        }

        water *= months;
        internet *= months;
        double average = (totalElectricity + water + internet + other) / months;

        System.out.printf("Electricity: %.2f lv%n" +
                "Water: %.2f lv%n" +
                "Internet: %.2f lv%n" +
                "Other: %.2f lv%n" +
                "Average: %.2f lv", totalElectricity, water, internet, other, average);
    }
}
