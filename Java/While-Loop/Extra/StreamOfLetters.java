import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.nextLine();
        String word = "";

        boolean countC = false;
        boolean countO = false;
        boolean countN = false;

        while (!symbol.equals("End")) {
            char letter = symbol.charAt(0);

            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                switch (letter) {
                    case 'c':
                        if (countC == false)
                            countC = true;
                        else
                            word += symbol;
                        break;

                    case 'o':
                        if (countO == false)
                            countO = true;
                        else
                            word += symbol;
                        break;

                    case 'n':
                        if (countN == false)
                            countN = true;
                        else
                            word += symbol;
                        break;

                    default:
                        word += symbol;
                        break;
                }

                if (countC == true && countO == true && countN == true){
                    countC = false;
                    countO = false;
                    countN = false;
                    System.out.print(word + " ");
                    word = "";
                }
            }

            symbol = scanner.nextLine();
        }
    }
}
