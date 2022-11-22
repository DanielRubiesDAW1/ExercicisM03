/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio1switch;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio1switch {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      
      
        System.out.println("******Bienvenido********");
        System.out.println("Pon un numero entre el 1 y el 12");
        System.out.println("************************");
         System.out.println("Escribe el numero aqui: ");
        
         int opcion = sc.nextInt(); //char es opcion caracter
        
        switch (opcion){
                
            case 1: 
                System.out.println("Enero");

                    break;
        
        
            case 2: 
                System.out.println("Febrero");

                 break;
        
            case 3: 
                System.out.println("Marzo");

                     break;
        
            case 4: 
                System.out.println("Abril");

                    break;
            
            case 5: 
                System.out.println("Mayo");

                     break;
                     
            case 6: 
                System.out.println("Junio");

                     break;
                     
            case 7: 
                System.out.println("Julio");

                     break; 

            case 8: 
                System.out.println("Agosto");

                     break;

            case 9: 
                System.out.println("Septiembre");

                     break;

            case 10: 
                System.out.println("Octubre");

                     break;

            case 11: 
                System.out.println("Noviembre");

                     break;           
                     
            case 12: 
                System.out.println("Diciembre");

                     break;
                     
                     
            default:
                          
                System.out.println("Opcion no valida");

        }
      
      
      
    }
}
