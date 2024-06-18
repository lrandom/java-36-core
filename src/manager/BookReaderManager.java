package manager;

import models.BookReader;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookReaderManager {
    private static String DB_PATH = "book_reader.dat";
    ArrayList<BookReader> bookReaders;

    void syncData() {
        try {
            FileOutputStream fos = new FileOutputStream(DB_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bookReaders);
            oos.close();
            fos.close();
        } catch (IOException e) {
        }
    }

    ArrayList<BookReader> getData() {
        try {
            FileInputStream fis = new FileInputStream(DB_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<BookReader> bookReaders = (ArrayList<BookReader>) ois.readObject();
            ois.close();
            fis.close();
            return bookReaders;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<BookReader>();
    }

    public BookReaderManager() {
        this.bookReaders = getData();
    }

    public int addBookReader(BookReader bookReader) {
        for (BookReader br : bookReaders) {
            if (br.getPhoneNumber().equalsIgnoreCase(bookReader.getPhoneNumber())) {
                return 0; //đã có user trong hệ thống
            }
        }
        bookReaders.add(bookReader);
        syncData();
        return 1; //thêm user thành công
    }

    public ArrayList<BookReader> getBookReaders() {
        return bookReaders;
    }

    public BookReader findBookReaderByPhoneNumber(String phoneNumber) {
        for (BookReader br : bookReaders) {
            if (br.getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
                return br;
            }
        }
        return null;
    }


}
