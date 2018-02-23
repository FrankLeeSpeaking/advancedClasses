package com.strausMAD105;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        List<Employee> employees = new ArrayList<>();// ---------------- Create list of employee -----------
        employees.add(new Employee("John Doe", PositionTitle.TECHNICAL, true, 26.25, 1, "Jan. 2, 1984", 45));
        employees.add(new Employee("Jane Doe", PositionTitle.SECRETARIAL, false, 17.25, 2, "Jan. 3, 1974", 50));
        employees.add(new Employee("Joe Doe", PositionTitle.PRODUCTION, false, 22.22, 3, "Jan.4, 2004", 35));

        for (Employee o : employees) {// ----- FOR loop to display employees from method displayAll in class Employee
            o.displayAll();
        }
    }
}