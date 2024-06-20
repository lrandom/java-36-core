package views;

import manager.BookManager;
import models.Book;
import models.Storage;

import java.util.Scanner;

public class BookView {
    public void showMenu() {
        int choice = 0;

        BookManager bookManager = new BookManager();
        do {
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị danh sách sách có trong thư viện");
            System.out.println("3. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thêm sách");
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Nhập tên sách: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập tác giả: ");
                    String author = sc.nextLine();
                    System.out.println("Nhập isbn: ");
                    String isbn = sc.nextLine();
                    Book book = new Book(isbn, name, author);
                    System.out.println("Nhập số lượng sách: ");
                    int quantity = sc.nextInt();
                    bookManager.addStorage(new Storage(quantity, book));
                    System.out.println("Thêm sách thành công");
                    break;

                case 2:
                    System.out.println("Hiển thị danh sách sách có trong thư viện");
                    for (Storage storage : bookManager.getAvailableBook()) {
                        System.out.println("Tên sách: " + storage.getBook().getTitle());
                        System.out.println("Tác giả: " + storage.getBook().getAuthor());
                        System.out.println("isbn: " + storage.getBook().getIsbn());
                        System.out.println("Số lượng sách: " + storage.getQuantity());
                        System.out.println("====================================");
                    }
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
