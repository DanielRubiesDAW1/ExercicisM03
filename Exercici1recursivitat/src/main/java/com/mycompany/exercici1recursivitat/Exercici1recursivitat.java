/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici1recursivitat;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici1recursivitat {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero de entrada: ");
        int n=sc.nextInt();
        int sortida=sumarecursiva(n);
        
                System.out.println("Sortida: "+sortida);
    }
    
    public static int sumarecursiva(int n){
    
             int resultadocalculo;
      
            if(n<=1){ // if(n<=1) seria lo mismo.
                
                return 1;
                
            }
            
            else if(n>1){
            
            return n+sumarecursiva(n-1);            
            }
    
    return 0;
    }
    
    
}
