import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGradeLimit = Integer.parseInt(scanner.nextLine());
        int badGrades = badGradeLimit;

        String name = scanner.nextLine();
        double average = 0.00;
        int count = 0;
        String lastProblem = null;

        while (!name.equals("Enough") && badGrades > 0){
            lastProblem = name;
            int grade = Integer.parseInt(scanner.nextLine());
            average += grade;

            if (grade <= 4)
                badGrades--;

            if (badGrades > 0)
                name = scanner.nextLine();

            count++;
        }

        if (name.equals("Enough"))
            System.out.printf("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", average/count, count, lastProblem);

        else
            System.out.printf("You need a break, %d poor grades.", badGradeLimit);
    }
}
