package edu.icet.service.custom;

import edu.icet.model.dto.Employee;
import edu.icet.service.SuperService;
import javafx.collections.ObservableList;

public interface EmployeeService extends SuperService {
    boolean addEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(String id);
    ObservableList<Employee> getAllEmployees();
    Employee searchEmployee(String phone);
    String getLastEmployeeId();
}
