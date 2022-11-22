/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejjercicio5buclesdeberes;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejjercicio5buclesdeberes {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in); 
      
        System.out.println("Escribe un numero positivio");
        int factorial;
        int acum_factorial=1;
        
        factorial = sc.nextInt();
        

        for(int contador=1; contador<=factorial; contador++){
    
            acum_factorial= contador*acum_factorial;
            
            if(contador!=factorial)
            System.out.print(contador*"");

            else{
            
                system.out.print()
            }
            
        
    }
            System.out.println("El factorial seria " + acum_factorial);
       
       
    }

}

