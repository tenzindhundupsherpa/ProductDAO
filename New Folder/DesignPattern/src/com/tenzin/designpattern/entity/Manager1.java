/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.designpattern.entity;

import com.tenzin.designpattern.dao.impl.Work;

/**
 *
 * @author Home
 */
public class Manager1 implements Work{

    @Override
    public void enter() {
        System.out.println("Go to room:");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meetObjective() {
        System.out.println("Find what you want:");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void finishWork() {
        System.out.println("Complete your task");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
