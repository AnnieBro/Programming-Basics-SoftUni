import java.util.Scanner;

public class Birthday {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        double total = volume * 0.001;
        percent *= 0.01;
        double necessaryLitres = total * (1 - percent);

        System.out.printf("%.3f", necessaryLitres);
    }
}
