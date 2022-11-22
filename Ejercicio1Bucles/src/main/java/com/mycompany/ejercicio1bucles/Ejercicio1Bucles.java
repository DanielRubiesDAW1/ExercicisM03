/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio1bucles;

/**
 *
 * @author daru4279
 */
public class Ejercicio1Bucles {

    public static void main(String[] args) {
        //While, do while, for
        int  i;
        //for (Valor inicial; condicion_continue; increment_variable )
        System.out.println("Bucle en el for");
        for (i = 0; i < 6; i++){
        
        System.out.println("--->"+i);
        //AUMENTO VARIABLE, PERO YA LO HACE EL i++ DEL FOR
        }
        
        System.out.println("bucle en un while");
        
        while (i < 6){
        System.out.println("*" +i);
        i++; // i = i+1
        
        }
   
        
        System.out.println("Bucle en do while"); 
        i=7;
        do{
        
        System.out.println("-" +i);
        i++; 
            
        }
        
        while(i<6);
       
    }
    
}
