import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();
        double grade = Double.parseDouble(scanner.nextLine());

        int i = 1;
        double average = 0;

        while (i < 12) {
            average += grade;
            grade = Double.parseDouble(scanner.nextLine());
            while (grade < 4) {
                grade = Double.parseDouble(scanner.nextLine());
            }
            i++;
        }

        average = (average + grade) / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, average);
    }
}
