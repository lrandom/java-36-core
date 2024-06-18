package views;

import manager.BookManager;
import manager.BookReaderManager;
import manager.TransactionManager;
import models.Book;
import models.Transaction;

import java.util.ArrayList;
import java.util.Scanner;

public class TransactionView {
    public void showMenu() {
        System.out.println("1. Mượn sách");
        System.out.println("2. Trả sách");
        System.out.println("3. Thoát");
        System.out.println("Mời bạn chọn chức năng: ");
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        TransactionManager transactionManager = new TransactionManager();
        do {
            switch (choice) {
                case 1:
                    System.out.println("Mượn sách");
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Nhập số đt độc giả: ");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Ngày mươn sách: ");
                    String borrowDate = sc.nextLine();
                    System.out.println("Ngày trả sách");

                    String returnDate = sc.nextLine();
                    System.out.println("Số sách người dùng mượn");
                    int n = sc.nextInt();
                    ArrayList<Book> books = new ArrayList<>();
                    BookManager bookManager = new BookManager();
                    BookReaderManager bo = new BookReaderManager();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập isbn sách thứ " + (i + 1));
                        String isbn = sc.nextLine();
                        books.add(bookManager.borrowBook(isbn));
                    }
                    System.out.println("Id mượn sách");
                    String id = sc.nextLine();
                    transactionManager.borrowBook(id, bo.findBookReaderByPhoneNumber(phoneNumber), books, borrowDate, returnDate, Transaction.STATUS_BORROWED);
                    break;

                case 2:
                    System.out.println("Trả sách");
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Nhập id mượn sách: ");
                    String id1 = sc1.nextLine();
                    TransactionManager transactionManager1 = new TransactionManager();
                    transactionManager.returnBook(transactionManager.find(id1));
                    break;
                    
                case 3:
                    System.out.println("Thoát chức năng quản lý sách");
                    break;

                default:
                    System.out.println("Chức năng không tồn tại");
                    break;
            }
        } while (choice != 3);
    }
}
