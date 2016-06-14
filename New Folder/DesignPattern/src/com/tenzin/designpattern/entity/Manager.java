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
public class Manager implements Work{

    @Override
    public void enter() {
        System.out.println("Enter the room:");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meetObjective() {
        System.out.println("Find your objectives:");
    
    }
    
    @Override
    public void finishWork() {
        System.out.println("Finish your work:");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
