import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentNumber = Integer.parseInt(scanner.nextLine());

        double grade5 = 0.0;
        double grade4 = 0.0;
        double grade3 = 0.0;
        double grade2 = 0.0;
        double totalAverage = 0.0;

        for (int i = 0; i < studentNumber; i++) {
            double studentGrade = Double.parseDouble(scanner.nextLine());

            if (studentGrade >= 5)
                grade5++;

            else if (studentGrade >= 4)
                grade4++;

            else if (studentGrade >= 3)
                grade3++;

            else
                grade2++;

            totalAverage += studentGrade;
        }

        grade5 /= studentNumber;
        grade4 /= studentNumber;
        grade3 /= studentNumber;
        grade2 /= studentNumber;
        totalAverage /= studentNumber;

        System.out.printf("Top students: %.2f%%%n" +
                "Between 4.00 and 4.99: %.2f%%%n" +
                "Between 3.00 and 3.99: %.2f%%%n" +
                "Fail: %.2f%%%n" +
                "Average: %.2f", grade5 * 100, grade4 * 100, grade3 * 100, grade2 * 100, totalAverage);
    }
}
