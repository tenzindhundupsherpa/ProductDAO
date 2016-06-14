/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzindao.controller;

import com.tenzindao.Product;
import com.tenzindao.dao.ProductDAO;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class ProductController {

    private Scanner input;
    ProductDAO productDAO;

    public ProductController(Scanner input, ProductDAO productDAO) {
        this.input = input;
        this.productDAO = productDAO;
    }

    private void menu() {
        System.out.println("1.Add Product information:");
        System.out.println("2.Delete Product:");
        System.out.println("3.Search:");
        System.out.println("4.Show All");
        System.out.println("5.Exit");
        System.out.println("Choose any option[1-5]");

    }

    private void add() {
        Product prod = new Product();
        while (true) {

            prod.setId(productDAO.count() + 1);
            System.out.println("Enter product name:");
            prod.setName(input.next());
            System.out.println("Enter brand name:");
            prod.setBrand(input.next());
            System.out.println("Enter Price:");
            prod.setAmount(input.nextFloat());
            System.out.println("Enter status");
            prod.setStatus(input.nextBoolean());
            productDAO.insert(prod);
            System.out.println("Do you want to add another?");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    private void delete() {
       
         Product pr=new Product();
        while(true){
        System.out.println("Do you want to delete item?[Y/N]");
        if(input.next().equalsIgnoreCase("n")){
            break;
        }
        showAll();
        System.out.println("Enter items ID to delete:");
        Product pro=productDAO.delete(input.nextInt());
        if (pro != null) {
            System.out.println("ID:" + pro.getId());
            System.out.println(pro.getName());
            System.out.println(pro.getName() + "has been deleted");
        }else 
            System.out.println("ID not found");
        
        
            System.out.println("Do you want to delete another?");
            if(input.next().equalsIgnoreCase("n")){
                break;
            }
        }
    }

    private void searchById() {
        while(true){
        System.out.println("Enter ID to search:");
        Product product = productDAO.searchById(input.nextInt());
        if (product != null) {
            System.out.println("ID:" + product.getId());
            System.out.println(product.getName());
        }else 
            System.out.println("ID not found");
        System.out.println("Do you want to search again?[Y/N]");
        if(input.next().equalsIgnoreCase("n")){
            break;
        }
        }
    }

    private void showAll() {
        for (Product p : productDAO.getAll()) {
            System.out.println("ID:" + p.getId());
            System.out.println(p.getName());
        }
        System.out.println("Press any key to continue:");
        input.next();
    }

    public void controller() {
        menu();
        switch (input.nextInt()) {
            case 1:
                add();
                break;
            case 2:
                delete();
                break;
            case 3:
                searchById();
                
                break;
            case 4:
                showAll();
                break;
            case 5:
                System.out.println("Do you really want to exit?[Y?N]");
                if (input.next().equalsIgnoreCase("y")) {
                    System.exit(0);
                }
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
