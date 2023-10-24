package org.example;

public class Employee {
    private String name;
    private String dateOfBirth;
    private double salary;

    public Employee(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String compareDatesMath(Employee otherEmployee) {
        String[] parts1 = this.dateOfBirth.split("-");
        String[] parts2 = otherEmployee.getDateOfBirth().split("-");

        int year1 = Integer.parseInt(parts1[0]);
        int month1 = Integer.parseInt(parts1[1]);
        int day1 = Integer.parseInt(parts1[2]);

        int year2 = Integer.parseInt(parts2[0]);
        int month2 = Integer.parseInt(parts2[1]);
        int day2 = Integer.parseInt(parts2[2]);

        int res = (year1 - year2) * 10000 + (month1 - month2) * 100 + (day1 - day2);
        switch (Integer.signum(res)) {
            case -1:
                return this.getName() + " was born earlier than " + otherEmployee.getName();
            case 0:
                return this.getName() + " and " + otherEmployee.getName() + " were born on the same date";
            case 1:
                return this.getName() + " was born later than " + otherEmployee.getName();
            default:
                return "";
        }
    }

}
