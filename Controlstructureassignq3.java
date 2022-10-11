/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.controlstructureassignq3;

import java.util.Scanner;

/**
 *
 * @author fletc
 */
public class Controlstructureassignq3 {

    public static void main(String[] args) {
       
        Scanner input= new Scanner (System.in);
        
        int radius = input.nextInt();
        int area = input.nextInt();
        
        final double PI=3.144444444444;
        
        if (radius>0){
        System.out.println(PI*radius*radius);
               
        }
        
        else{
        
        
        System.out.println("Negative input");
        
        
        
        }
        
        System.out.println("Enter the radius"+ radius);
        
        
        
        
    }
}
