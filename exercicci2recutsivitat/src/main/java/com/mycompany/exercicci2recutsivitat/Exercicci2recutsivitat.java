/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicci2recutsivitat;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercicci2recutsivitat {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Dime la base del numero: ");
        int base=sc.nextInt();
        System.out.println("Dime la potencia del numero: ");
        int potencia=sc.nextInt();
        
        
        int calculo=sumapotencia(base, potencia);    
        System.out.println("El resultado es "+calculo);
    }
    
    
    
    

    public static int sumapotencia(int base, int potencia){
    
        
        if(potencia==0){
        
            return 1;
        }
   
        else if (potencia>0){
        
            return base*sumapotencia(base,potencia-1);
        }
            
            
            
        return 0;
    
   
    }
} 
