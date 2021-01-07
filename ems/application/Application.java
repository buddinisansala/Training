package application;

import employee.Employee;
import manager.Manager;

public class Application {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        employee.print();
        manager.print();
    }
}
