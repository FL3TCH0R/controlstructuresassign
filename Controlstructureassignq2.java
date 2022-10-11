/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.controlstructureassignq2;

import java.util.Scanner;

/**
 *
 * @author fletc
 */
public class Controlstructureassignq2 {

    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        
       
        
        int grade= input.nextInt();
        
       
        if(grade>=80){
        System.out.println("More than 80%");
       }
        else if(grade>=60){
        System.out.println("More than 60%");
    }
        else if(grade>=40){
        System.out.println("Average");
    }
        {
        System.out.println("Failed");
        }  
       System.out.println("Enter the grade"+ grade);
       
       input.close();
    }     
}
