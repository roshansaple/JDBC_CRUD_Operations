package com.ved;

import com.ved.controller.EmployeeController;

public class JdbcApplication {
    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();
       // employeeController.printAllEmployees();

        employeeController.printEmployeesByID(1702);


        // public Employee(int id, String firstName, String lastName, String email, String jobTitle)
        //Employee emp = new Employee(109, "Rakseh", "Sharma", "rakseshsharma@gmail.com", "Software Engineer");

        // employeeController.addEmployee(emp);

        // employeeController.deleteEmployee(101);

        // Employee emp1 = new Employee(109, "Rakseh", "Sharmaa", "rakseshsharma@gmail.com", "Software Engineer");
        //employeeController.updateEmployee(emp1);


    }
}
