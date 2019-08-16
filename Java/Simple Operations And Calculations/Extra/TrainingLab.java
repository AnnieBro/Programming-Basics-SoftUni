import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double h = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());

        int rows = (int)(Math.floor((h * 100)/120));
        int seatsPerRow = (int)(Math.floor((w * 100 - 100)/70));

        int seats = rows * seatsPerRow - 3;
        System.out.println(seats);
    }
}