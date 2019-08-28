import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine().toLowerCase();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income = 0;

        switch (projection){
            case "premiere":
                income = rows * columns * 12.00;
                break;
            case "normal":
                income = rows * columns * 7.50;
                break;
            case "discount":
                income = rows * columns * 5.00;
                break;
        }

        System.out.printf("%.2f leva", income);
    }
}
