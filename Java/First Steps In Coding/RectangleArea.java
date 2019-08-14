import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("b = ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Area = " + a*b);
    }
}
