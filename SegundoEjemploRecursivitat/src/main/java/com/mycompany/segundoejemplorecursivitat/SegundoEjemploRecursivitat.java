/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.segundoejemplorecursivitat;

/**
 *
 * @author daru4279
 */
public class SegundoEjemploRecursivitat {

    public static void main(String[] args) {
        
        int num=5;

        salut(num);

    }

    public  static void salut(int n){
            
     //caso base
     if(n==1){
     
         System.out.println("Hurra! ");
     }
        
     else{
     
         System.out.print(n+"Hip ");
              salut(n-1);

     }
        
    }
}
