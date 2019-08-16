import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int requiredHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());

        double workHours = (days * (1 - 0.10)) * 8;
        double extraHours = 2 * employees * days;
        double total = Math.floor(workHours + extraHours);
        double hoursLeft = Math.abs(total - requiredHours);

        if(total >= requiredHours)
            System.out.printf("Yes!%.0f hours left.", hoursLeft);
        else
            System.out.printf("Not enough time!%.0f hours needed.", hoursLeft);
    }
}
