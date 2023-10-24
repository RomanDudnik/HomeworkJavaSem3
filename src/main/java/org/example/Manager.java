package org.example;

public class Manager extends Employee {
    public Manager(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }
    public static void increaseSalary(Employee[] employees, double percentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary + (currentSalary * percentage / 100);
                employee.setSalary(newSalary);
            }
        }
    }
}



