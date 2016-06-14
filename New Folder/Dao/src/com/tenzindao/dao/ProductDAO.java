/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzindao.dao;

import com.tenzindao.Product;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public interface ProductDAO{
    
    boolean insert(Product p);
    Product delete(int id);
    Product searchById(int id);
    ArrayList<Product> getAll();
    int count();
    
    
}
