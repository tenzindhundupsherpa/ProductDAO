/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.designing.controller;

import com.tenzin.designing.dao.EmployeeDAO;
import com.tenzin.designing.entity.Employee;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class EmployeeController {

    EmployeeDAO employeeDAO;
    private Scanner input;

    public EmployeeController(Scanner input, EmployeeDAO employeeDAO) {
        this.input = input;
        this.employeeDAO = employeeDAO;
    }

    private void menu() {
        System.out.println("1.Add employee");
        System.out.println("2.Delete employee");
        System.out.println("3.Search");
        System.out.println("4.Show All");
        System.out.println("5.Exit");
        System.out.println("Enter your choice.");
    }

    private void add() {
        Employee e = new Employee();
        while(true){
        e.setId(employeeDAO.count()+1);
        System.out.println("Enter your first name:");
        e.setFirstName(input.next());
        System.out.println("Enter your last name:");
        e.setLastName(input.next());
        System.out.println("Enter your email:");
        e.setEmail(input.next());
        System.out.println("Enter Status:");
        e.setStatus(input.nextBoolean());
        employeeDAO.insert(e);
            System.out.println("Do you want to enter again?");
            if(input.next().equalsIgnoreCase("n")){
                break;
            }
        }
    }

    private void delete() {

    }

    private void searchById() {

    }

    private void showAll() {
        for (Employee emp : employeeDAO.getAll()) {
            System.out.println("ID:" + emp.getId());
            System.out.println("Name:" + emp.getFullName());
        }
        System.out.println("Press any key to continue.");
        input.next();
    }

    public void process() {
        menu();
        switch (input.nextInt()) {
            case 1:
                add();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                showAll();
                break;
            case 5:
                System.out.println("Do you really want to exit?[y/n]");
                if (input.next().equalsIgnoreCase("y")) {
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Invalid choice:");
                break;
        }
    }
}
