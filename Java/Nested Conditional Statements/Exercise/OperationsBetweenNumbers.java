import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        double result = 0.00;

        switch (operator){
            case '+':
                result = N1 + N2;
                break;
            case '-':
                result = N1 - N2;
                break;
            case '*':
                result = N1 * N2;
                break;
            case '/':
                result = (double)N1 / (double)N2;
                if(N2 == 0)
                    System.out.printf("Cannot divide %d by zero", N1);
                else
                    System.out.printf("%d / %d = %.2f", N1, N2, result);
                break;
            case '%':
                if(N2 == 0)
                    System.out.printf("Cannot divide %d by zero", N1);
                else {
                    result = N1 % N2;
                    System.out.printf("%d %% %d = %.0f", N1, N2, result);
                }
                break;
        }

        boolean even = (int)result % 2 == 0;
        if(operator == '+' || operator == '-' || operator =='*'){
            if(even)
                System.out.printf("%d %c %d = %.0f - even", N1, operator, N2, result);
            else
                System.out.printf("%d %c %d = %.0f - odd", N1, operator, N2, result);

        }
    }
}