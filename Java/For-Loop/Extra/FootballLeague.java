import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadium = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        double sectorA = 0.0;
        double sectorB = 0.0;
        double sectorV = 0.0;
        double sectorG = 0.0;
        double fanPercentage = (fans / (double) stadium) * 100;

        for (int i = 0; i < fans; i++) {
            String sector = scanner.nextLine().toLowerCase();

            switch (sector) {
                case "a": sectorA++; break;
                case "b": sectorB++; break;
                case "v": sectorV++; break;
                case "g": sectorG++; break;
            }
        }

        sectorA /= fans;
        sectorB /= fans;
        sectorV /= fans;
        sectorG /= fans;

        System.out.printf("%.2f%%%n" +
                "%.2f%%%n" +
                "%.2f%%%n" +
                "%.2f%%%n" +
                "%.2f%%%n", sectorA * 100, sectorB * 100, sectorV * 100, sectorG * 100, fanPercentage);
    }
}
