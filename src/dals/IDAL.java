package dals;

import java.util.ArrayList;

public interface IDAL<T>{
    public void add(T obj);
    public ArrayList<T> getList();
}
