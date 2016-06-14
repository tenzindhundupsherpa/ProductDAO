/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.designing.dao.impl;

import com.tenzin.designing.dao.EmployeeDAO;
import com.tenzin.designing.entity.Employee;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class EmployeeDAOImpl implements EmployeeDAO{
    ArrayList<Employee> employeeList=new ArrayList<>();
    
    @Override
    public boolean insert(Employee e) {
        return employeeList.add(e);
    }
    
    
    @Override
    public boolean delete(int id) {
        Employee e=getById(id);
        if(e!=null){
            employeeList.remove(e);
            return true;
        }
        return false;
    }

    @Override
    public Employee getById(int id) {
        for(Employee e:employeeList){
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Employee> getAll() {
        return employeeList;
    }

    @Override
    public int count() {
        return employeeList.size();
            }

    
    
}
