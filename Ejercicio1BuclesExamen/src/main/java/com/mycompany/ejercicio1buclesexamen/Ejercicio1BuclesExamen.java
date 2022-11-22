/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio1buclesexamen;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio1BuclesExamen {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int tipus1 = 1;
        int tipus2 = 2;
        int eleccion_tipus = 0;
        System.out.println("Que tipus de dia es avui? ");
        char eleccion = sc.next().charAt(0); 

        switch (eleccion){
                
            case 'L':
            case 'l': 
                
                System.out.println("Selecciona el tipus del teu esmorzar: ");
                eleccion_tipus=sc.nextInt();
                
                if(eleccion_tipus==tipus1){
                    
                    System.out.println("Son 2,00 €");

                }
                
                else if(eleccion_tipus==tipus2){
                
                    System.out.println("Son 2,50 €");

                }
                
                else{
                    System.out.println("Tipus incorrecte");

                }
                    break;
        
        
            case 'S':
            case 's': 
                
                System.out.println("Selecciona el tipus del teu esmorzar: ");
                eleccion_tipus=sc.nextInt();
                
                if(eleccion_tipus==tipus1){
                    
                    System.out.println("Son 2,20 €");

                }
                
                else if(eleccion_tipus==tipus2){
                
                    System.out.println("Son 2,70 €");

                }
              
                else{
                    System.out.println("Tipus incorrecte");

                }
                
                break;
        
            case 'F': 
            case 'f': 
                
                System.out.println("Selecciona el tipus del teu esmorzar: ");
                eleccion_tipus=sc.nextInt();
                
                if(eleccion_tipus==tipus1){
                    
                    System.out.println("Son 2,30 €");

                }
                
                else if(eleccion_tipus==tipus2){
                
                    System.out.println("Son 2,80 €");

                }

                else{
                    System.out.println("Tipus incorrecte");

                }
                     break;
                
            default:
                          
                System.out.println("Opcion incorrecta");

        }
        
    }
}
