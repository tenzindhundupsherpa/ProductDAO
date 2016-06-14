/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.designing.dao;

import com.tenzin.designing.entity.Employee;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public interface EmployeeDAO {
    
    boolean insert(Employee e);
    boolean delete(int id);
    Employee getById(int id);
    ArrayList<Employee> getAll();
    int count();
}
