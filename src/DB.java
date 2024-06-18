import models.Employee;

import java.io.*;
import java.util.ArrayList;

public class DB {
    String DB_PATH = "/Users/luan_prep_vn/employee.dat";

    public String getDB_PATH() {
        return DB_PATH;
    }

    public void setDB_PATH(String DB_PATH) {
        this.DB_PATH = DB_PATH;
    }

    ArrayList<Employee> getData() {
        try {
            FileInputStream fileInputStream = new FileInputStream(DB_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<Employee>) objectInputStream.readObject();
        } catch (Exception e) {

        }
        return new ArrayList<Employee>();
    }

    void setData(ArrayList<Employee> object) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(DB_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
