import models.Book;
import views.BookReaderView;
import views.BookView;
import views.TransactionView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Xin chào đến với thư viện lập trình");
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Quản lý sách");
        System.out.println("2. Quản lý độc giả");
        System.out.println("3. Quản lý mượn/trả sách");
        System.out.println("4. Thoát");
        System.out.println("Mời bạn chọn chức năng: ");
        choice = scanner.nextInt();
        do {
            switch (choice) {
                case 1:
                    System.out.println("Quản lý sách");
                    BookView bookView = new BookView();
                    bookView.showMenu();
                    break;

                case 2:
                    System.out.println("Quản lý độc giả");
                    BookReaderView bookReaderView = new BookReaderView();
                    bookReaderView.showMenu();
                    break;

                case 3:
                    System.out.println("Quản lý mượn/trả sách");
                    TransactionView transactionView = new TransactionView();
                    transactionView.showMenu();
                    break;

                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Chức năng không tồn tại");
                    break;
            }
        } while (choice != 4);

    }
}
