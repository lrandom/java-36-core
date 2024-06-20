package views;

import manager.BookManager;
import manager.BookReaderManager;
import models.BookReader;

import java.util.Scanner;

public class BookReaderView {
    public void showMenu() {
        int choice = 0;
        BookReaderManager bookReaderManager = new BookReaderManager();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Thêm thông tin độc giả");
            System.out.println("2. Hiển thị danh sách độc giả đã đk");
            System.out.println("3. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Thêm thông tin độc giả");
                    System.out.println("Nhập tên độc giả: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập số điện thoại: ");
                    String phone = sc.nextLine();
                    System.out.println("Nhập điạ chỉ: ");
                    String address = sc.nextLine();
                    //clear buffer
                    sc = new Scanner(System.in);
                    System.out.println("Nhập tuổi: ");
                    int age = sc.nextInt();
                    BookReader bookReader = new BookReader(name, phone, address, age);
                    bookReaderManager.addBookReader(bookReader);
                    System.out.println("Thêm độc giả thành công");
                    break;

                case 2:
                    for (BookReader reader : bookReaderManager.getBookReaders()) {
                        System.out.println("Tên độc giả: " + reader.getName());
                        System.out.println("Số điện thoại: " + reader.getPhoneNumber());
                        System.out.println("Địa chỉ: " + reader.getAddress());
                        System.out.println("Tuổi: " + reader.getAge());
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
