/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio9funciones;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio9funciones {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        int mayor;
        
        System.out.println("Pon un primer numero: ");
        num1= sc.nextInt();
        
        System.out.println("Pon un segundo numero: ");
        num2= sc.nextInt();
                
        System.out.println("Pon un tercer numero: ");
        num3= sc.nextInt();

        mayor=esMayor(num1,num2);
        mayor=esMayor(num3,mayor);        
        
                
            System.out.println("El valor mas grande es: "+mayor);

    }
    
     public static int esMayor(int v1,int v2) {
         
         int mayor;
         
         if(v1>2){
         
             mayor=v1;
         }
         
         else{
         
             mayor=v2;
         }
         
         return mayor;
         
     }
    
}


