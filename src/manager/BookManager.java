package manager;

import models.Book;
import models.Storage;

import java.io.*;
import java.util.ArrayList;

public class BookManager {
    private static String DB_PATH = "book.dat";

    private void syncData() {
        try {
            FileOutputStream fos = new FileOutputStream(DB_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(storageList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Storage> getData() {
        try {
            FileInputStream fis = new FileInputStream(DB_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Storage> storageList = (ArrayList<Storage>) ois.readObject();
            ois.close();
            fis.close();
            return storageList;
        } catch (IOException | ClassNotFoundException e) {
        }
        return new ArrayList<Storage>();
    }

    ArrayList<Storage> storageList;

    public BookManager() {
        storageList = getData();
    }

    public void addStorage(Storage storage) {
        for (Storage s : storageList) {
            //nếu đã có quyển sách đấy trong CSDL thì cộng thêm số lượng
            if (s.getBook().getIsbn().equalsIgnoreCase(storage.getBook().getIsbn())) {
                s.setQuantity(s.getQuantity() + storage.getQuantity());
                syncData();
                return;
            }
        }
        storageList.add(storage);
        syncData();
    }

    public ArrayList<Storage> getAvailableBook() {
        ArrayList<Storage> availableBook = new ArrayList<>();
        for (Storage s : storageList) {
            if (s.getQuantity() > 0) {
                availableBook.add(s);
            }
        }
        return availableBook;
    }

    public Book borrowBook(String isbn) {
        for (Storage s : storageList) {
            if (s.getBook().getIsbn().equalsIgnoreCase(isbn)) {
                s.setQuantity(s.getQuantity() - 1);
                syncData();
                return s.getBook();
            }
        }
        return null;
    }

    public void returnBook(String isbn) {
        for (Storage s : storageList) {
            if (s.getBook().getIsbn().equalsIgnoreCase(isbn)) {
                s.setQuantity(s.getQuantity() + 1);
                syncData();
                return;
            }
        }
    }
}
