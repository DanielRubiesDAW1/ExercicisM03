/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio13buclesdeberes;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio13buclesdeberes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int minimo = 1;
        int maximo = 100;
        int mitad;
        char respuesta;

        do{
        mitad = (minimo + maximo)/2;
            
        System.out.println("La mitad seria " + mitad);       
        System.out.println("He acertado (i,m,n) ");       

                
        
            respuesta=sc.nextLine().charAt(0);
            
            if(respuesta=='m'){
            
            minimo=mitad;
            
           }

            else if(respuesta=='n'){
            
                maximo= mitad;
            
            }
            
        }while(respuesta!='i');
        
                System.out.println("Acertaste");       


    }
}

