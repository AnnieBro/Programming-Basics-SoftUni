import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();

        switch(shape){
            case "square":
                double side1 = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", side1*side1);
                break;
            case "rectangle":
                double side2 = Double.parseDouble(scanner.nextLine());
                double side3 = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", side2*side3);
                break;
            case "circle":
                double radius = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", Math.PI*radius*radius);
                break;
            case "triangle":
                double side4 = Double.parseDouble(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", side4*height/2);
        }
    }
}
