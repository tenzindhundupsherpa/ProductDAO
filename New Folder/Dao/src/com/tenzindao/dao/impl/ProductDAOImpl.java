/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzindao.dao.impl;

import com.tenzindao.Product;
import com.tenzindao.dao.ProductDAO;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class ProductDAOImpl implements ProductDAO{
ArrayList<Product> productList=new ArrayList<>();
    @Override
    public boolean insert(Product p) {
        return productList.add(p);
    }

    @Override
    public Product delete(int id) {
       Product p=searchById(id);
       if(p!=null){
           productList.remove(p);
           
       }
       return p;
    }

    @Override
    public Product searchById(int id) {
        for(Product p:productList){
            if(p.getId()==id){
              return p;
            }
        }
       return null;
    }

    @Override
    public ArrayList<Product> getAll() {
        return productList;
    }

    @Override
    public int count() {
        return productList.size();
    }
    
}
