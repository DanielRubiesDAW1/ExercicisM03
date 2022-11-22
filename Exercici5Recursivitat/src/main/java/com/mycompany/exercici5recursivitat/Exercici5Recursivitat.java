/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici5recursivitat;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici5Recursivitat {

    public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero de entrada: ");
        int num=sc.nextInt();
       
     Invertirnumero(num);   
        
    }
    
    
    public static void Invertirnumero(int num){
        
           
           if(num<10){
           
               System.out.print(num);
               
           }
    
           else{
           
               System.out.print(num%10);
               Invertirnumero(num/10);
           }
           
    }
}
    
   

