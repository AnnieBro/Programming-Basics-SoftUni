import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String m1 = scanner.nextLine();
        String m2 = scanner.nextLine();

        if(m1.equals("mm")){
            if(m2.equals("cm"))
                System.out.printf("%.3f", number / 10);
            else if(m2.equals("m"))
                System.out.printf("%.3f", number / 1000);
            else
                System.out.printf("%.3f", number);
        }
        else if(m1.equals("cm")){
            if(m2.equals("mm"))
                System.out.printf("%.3f", number * 10);
            else if(m2.equals("m"))
                System.out.printf("%.3f", number / 100);
            else
                System.out.printf("%.3f", number);
        }
        else if(m1.equals("m")){
            if(m2.equals("mm"))
                System.out.printf("%.3f", number * 1000);
            else if(m2.equals("cm"))
                System.out.printf("%.3f", number * 100);
            else
                System.out.printf("%.3f", number);
        }
    }
}
