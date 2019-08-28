import java.util.Scanner;

public class GraduationTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int gradeCount = 0;
        double average = 0.00;
        boolean fail = false;

        while (gradeCount < 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4.00) {
                gradeCount++;
                average += grade;
                fail = false;
            }

            else {
                if (fail == true){
                   System.out.printf("%s has been excluded at %d grade", name, gradeCount + 1);
                   break;
                }
                fail = true;
            }
        }

        if(gradeCount == 12)
            System.out.printf("%s graduated. Average grade: %.2f", name, average/12);
    }
}
