package dals;

import models.Student;

import java.util.ArrayList;

public class StudentDal extends DB<Student> implements IDAL<Student> {
    public static final String FILE_PATH = "/Users/lrandom/Desktop/student.dat";
    public StudentDal() {
        this.setFilePath(FILE_PATH);
        syncData();
    }

    @Override
    public void add(Student obj) {
        list.add(obj);
        writeData(list, FILE_PATH);
    }

    @Override
    public ArrayList<Student> getList() {
        return list;
    }
}
