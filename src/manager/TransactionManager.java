package manager;

import models.Book;
import models.BookReader;
import models.Transaction;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TransactionManager {
    ArrayList<Transaction> transactions;

    private static String DB_PATH = "book.dat";

    void syncData() {
        try {
            // Save data to file
            FileOutputStream fos = new FileOutputStream(DB_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(transactions);
            oos.close();
            fos.close();
        } catch (Exception e) {
        }
    }

    ArrayList<Transaction> getData() {
        try {
            // Read data from file
            FileInputStream fis = new FileInputStream(DB_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Transaction> transactions = (ArrayList<Transaction>) ois.readObject();
            ois.close();
            fis.close();
            return transactions;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<Transaction>();
    }

    public TransactionManager() {
        this.transactions = getData();
    }

    public void borrowBook(String id, BookReader bookReader, ArrayList<Book> books,
                           String borrowDate,
                           String returnDate, int status) {
        transactions.add(new Transaction(id, bookReader, books, borrowDate,
                returnDate, status));
        syncData();
    }

    private int findTransactionById(String id) {
        for (Transaction transaction : transactions) {
            if (transaction.getId().equalsIgnoreCase(id)) {
                return transactions.indexOf(transaction);
            }
        }
        return -1;
    }

    public Transaction find(String id) {
        for (Transaction transaction : transactions) {
            if (transaction.getId().equalsIgnoreCase(id)) {
                return transaction;
            }
        }
        return null;
    }

    public boolean returnBook(Transaction transaction) {
        transaction.setStatus(Transaction.STATUS_RETURNED);
        if (findTransactionById(transaction.getId()) != -1) {
            transactions.set(findTransactionById(transaction.getId()), transaction);
            syncData();
            return true;
        }
        return false;
    }
}
