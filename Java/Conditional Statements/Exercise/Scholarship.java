import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double earnings = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double minWage = Double.parseDouble(scanner.nextLine());

        double socialScholarship = Math.floor(minWage * 0.35);
        double excellentScholarship = Math.floor(grade * 25);

        boolean social = minWage > earnings && grade >= 4.50;
        boolean excellent = grade >= 5.50;

        if(social && excellent){
            if(socialScholarship >= excellentScholarship)
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
            else
                System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        }
        else if(social)
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        else if(excellent)
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        else
            System.out.printf("You cannot get a scholarship!");
    }
}
