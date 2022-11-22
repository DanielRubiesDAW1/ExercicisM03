/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio10buclesdeberes;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio10buclesdeberes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
               
        boolean puesto_10 = false;
        int nota;
        int cuenta_notas=0;
        do{
        System.out.println("Pon tu nota, para terminar escribe -1");       
    
        nota=sc.nextInt();

        if (nota==10)
            {

              puesto_10=true;
                
           }
         
        if(nota>10 || nota<-1)
            
            {

                System.out.println("Nota incorrecta debe estar entre 0 y 10");       

            }
        
        else
            
        {
        cuenta_notas++;
        }
        
      
        }while(nota!=-1);
        
            
            if (puesto_10 = true)
                
            {
                System.out.println("Has puesto algun 10");
                
            }
            
            
    }
}
