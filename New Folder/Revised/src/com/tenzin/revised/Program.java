/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.revised;

import com.tenzin.revised.entity.Students;
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
        Students std=new Students();
        
        System.out.println("Hello World");
        while(true){
        System.out.println("Enter number for multiplication table:");
        int num=input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num + "*" + i + "=" + (num*i));
        }
            System.out.println("Do you want to check another table?[Y/N]");
            if(input.next().equalsIgnoreCase("n")){
                break;
            }
        }
        while(true){
        
        System.out.println("Enter First Number:");
        double num1=input.nextDouble();
        System.out.println("Enter Second Number:");
        double num2=input.nextDouble();
        
        double add,sub,mul,div,rem,power;       
        
        System.out.println("1.Add");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Remainder");
        System.out.println("6.Power");
        System.out.println("7.What do you want to do?(1-6)");
        
        int choice=input.nextInt();
        if(choice==1){
            add=num1+num2;
            System.out.println(add);
        }
        else if(choice==2){
            sub=num1 - num2;
            System.out.println(sub);
        }
        else if(choice==3){
            mul=num1 * num2;
            System.out.println(mul);
        }
        else if(choice==4){
            div=num1 / num2;
            System.out.println(div);
        }
        else if(choice==5){
            rem=num1 % num2;
            System.out.println(rem);
        }
        else if(choice==6){
            power=
            System.out.println(power);
        }
        else 
            System.exit(0);
            System.out.println("Enter your id:");
        std.setId(input.nextInt());
        System.out.println(std.getId());
            System.out.println("Enter your first name:");
        std.setFirstName(input.next());
            System.out.println("Enter your last name:");
        std.setLastName(input.next());
        
        std.getFullName();
        
            System.out.println("Do you want to continue?");
            if(input.next().equalsIgnoreCase("n")){
                break;
            }
        } 
    }
    
}
