import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String leap = scanner.nextLine().toLowerCase();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        //games in Sofia total:(48 - h) * 3/4 + p * 2/3
        //total games          :sofiaGames + h
        //if leap              : totalGames * 1.15
        //Math.floor(totalGames)
        double totalGames = (48 - h) * 3.0 / 4 + h + p * 2.0 / 3;

        if (leap.equals("leap"))
            totalGames *= 1.15;

        System.out.printf("%.0f", Math.floor(totalGames));
    }
}