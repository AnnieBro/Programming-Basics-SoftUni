import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        int bookNumber = Integer.parseInt(scanner.nextLine());

        String book = scanner.nextLine();
        int bookAmount = 0;

        while(!bookName.equals(book)&&bookNumber>1){
            bookNumber--;
            book = scanner.nextLine();
            bookAmount++;
        }

        if(bookName.equals(book))
            System.out.printf("You checked %d books and found it.", bookAmount);

        else
            System.out.printf("The book you search is not here!%nYou checked %d books.", bookAmount + 1);
    }
}
