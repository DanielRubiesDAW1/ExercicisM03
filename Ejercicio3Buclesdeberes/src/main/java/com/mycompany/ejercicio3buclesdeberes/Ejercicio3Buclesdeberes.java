/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3buclesdeberes;

/**
 *
 * @author daru4279
 */
public class Ejercicio3Buclesdeberes {

    public static void main(String[] args) {
          System.out.println("Numeros pares: ");
         
        int contador;
        
        System.out.println(" ");
        
        for (contador=2; contador<=200;contador=contador+2)
    
            System.out.println(" "+ contador);
        
        System.out.println("contador 1 en 1 mostrando solo pares  ");
        
        for (contador=2; contador<=200;contador++)
    
            System.out.println(" "+ contador);
    
    
        if(contador%2==0)
            {
                System.out.println("Par "+ contador);

            }
    }
}
