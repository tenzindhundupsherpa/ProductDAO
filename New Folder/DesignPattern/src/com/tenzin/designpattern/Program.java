/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.designpattern;

import com.tenzin.designpattern.dao.impl.Work;
import com.tenzin.designpattern.entity.Manager;
import com.tenzin.designpattern.entity.Manager1;
import java.util.ArrayList;
/**
 *
 * @author Home
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Work work=new Manager1();
        
        work.enter();
        work.meetObjective();
        work.finishWork();
        
        
    }
    
}
