/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzindao;

import com.tenzindao.controller.ProductController;
import com.tenzindao.dao.ProductDAO;
import com.tenzindao.dao.impl.ProductDAOImpl;
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
        ProductDAO productDAO=new ProductDAOImpl();
        System.out.println("Welcome to ");
        ProductController pController=new ProductController(input, productDAO);
        while(true){
        pController.controller();
        
        }
        
    }
    
}
