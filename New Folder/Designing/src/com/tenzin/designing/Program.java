/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.designing;
import com.tenzin.designing.controller.EmployeeController;
import com.tenzin.designing.dao.EmployeeDAO;
import com.tenzin.designing.dao.impl.EmployeeDAOImpl;
import com.tenzin.designing.entity.Employee;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Home
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        EmployeeDAO employeeDAO=new EmployeeDAOImpl();
        EmployeeController empController=new EmployeeController(input, employeeDAO);
        System.out.println("Welcome to Employee mangament system.");
        
        
        
        while(true){
       
        empController.process();
       
        }
    }
}
