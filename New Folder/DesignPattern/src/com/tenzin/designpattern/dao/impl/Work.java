/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.designpattern.dao.impl;

import com.tenzin.designpattern.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public interface Work {
    
    void enter();
    void meetObjective();
    void finishWork();
    ArrayList<Student> getAll();
    
    
}
