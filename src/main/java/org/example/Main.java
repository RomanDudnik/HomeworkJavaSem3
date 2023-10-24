package org.example;

/**
 * 1. Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
 * представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
 * 2. Опишите класс руководителя, наследник от сотрудника.
 * Перенесите статический метод повышения зарплаты в класс руководителя,
 * модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
 * кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников.
 * Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */
public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Manager("John", "1990-01-01");
        employees[0].setSalary(10000.0);
        employees[1] = new Employee("Anna", "1995-02-03");
        employees[1].setSalary(1000.0);
        employees[2] = new Employee("Mike", "1988-06-15");
        employees[2].setSalary(800.0);

        Manager.increaseSalary(employees, 10.0);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }

        String comparisonResult = employees[1].compareDatesMath(employees[2]);
        System.out.println(comparisonResult);
    }
}
