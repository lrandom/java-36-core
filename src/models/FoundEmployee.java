package models;

public class FoundEmployee {
    int index;
    Employee employee;

    public FoundEmployee(int index, Employee employee) {
        this.index = index;
        this.employee = employee;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
