import models.Employee;
import models.FoundEmployee;

import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees;
    DB db;

    public EmployeeManager() {
        db = new DB();
        employees = db.getData();
    }

    public void addEmployee(Employee employee) {
        // Add employee to database
        employees.add(employee);
        syncData();
    }

    public FoundEmployee findEmployee(String id) {
        // Find employee in database
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return new FoundEmployee(employees.indexOf(employee), employee);
            }
        }
        return null;
    }

    public void updateEmployee(Employee employee, int index) {
        // Update employee in database
        employees.set(index, employee);
        syncData();
    }

    public void deleteEmployee(String id) {
        // Delete employee from database
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                employees.remove(employee);
                break;
            }
        }
        syncData();
    }

    public ArrayList<Employee> searchEmployee(String name) {
        ArrayList<Employee> searchEmployee = new ArrayList<>();
        // Search employee in database
        for (Employee employee : employees) {
            if (employee.getName().indexOf(name) != -1) {
                searchEmployee.add(employee);
            }
        }
        return searchEmployee;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void syncData() {
        // Sync data to database
        db.setData(employees);
    }
}
