/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.examenm03dani;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class ExamenM03Dani {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

            int numero;
            
            System.out.println("Escribe un numero");
            numero =sc.nextInt();
            
            if(numero%2==0){
            
                if(numero%3==0){
                
                    System.out.println("Numero parell y divisible entre 3");

                }

                else
                {
                
                    System.out.println("Numero parell y NO divisible entre 3");

                    
                }
                
            }  
            
                else
                {
                        
                    System.out.println("El numero es senar");
    
                }
                
                
            
            
    }
}
