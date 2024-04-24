package dals;

import models.Student;
import models.Subject;

import java.util.ArrayList;

public class SubjectDal extends DB<Subject> implements IDAL<Subject> {
    public static final String FILE_PATH = "/Users/lrandom/Desktop/subject.dat";

    public SubjectDal() {
        this.setFilePath(FILE_PATH);
        syncData();
    }

    @Override
    public void add(Subject obj) {
        list.add(obj);
        writeData(list);
    }

    @Override
    public ArrayList<Subject> getList() {
        return list;
    }
}
