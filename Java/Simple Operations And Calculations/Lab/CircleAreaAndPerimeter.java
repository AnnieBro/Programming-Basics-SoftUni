import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());

        double area = r*r*Math.PI;
        double perimeter = 2*r*Math.PI;

        System.out.printf("%.2f", area);
        System.out.println();
        System.out.printf("%.2f", perimeter);
    }
}