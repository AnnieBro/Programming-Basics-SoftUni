import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double a = Double.parseDouble(scanner.nextLine());

        double areaHall = (l*100) * (w*100);
        double areaWardrobe = Math.pow((a*100),2);
        double areaBench = areaHall/10;
        double freeSpace = Math.floor(areaHall - areaWardrobe - areaBench);
        int dancers = (int)freeSpace/(40+7000);

        System.out.println(dancers);
    }
}
