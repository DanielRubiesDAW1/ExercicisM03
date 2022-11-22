/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici1examenm03;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici1Examenm03 {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    
   boolean correcte=true;

    int dia, mes, año;
    
    System.out.println("Escribe un dia ");
    dia = sc.nextInt();
    System.out.println("Escribe el mes ");
    mes = sc.nextInt();
    System.out.println("Escribe el any ");
    año = sc.nextInt(); 
    
    
    if(año<=1900){
            
                    
            System.out.println("Año incorrecto, el año tiene que ser superior a 1900");
        correcte=false;

            }     
        
    if(mes>=13 && mes>=1){
        
            System.out.println("Mes incorrecto tiene eque ser entre 1 y 12");
        correcte=false;

    }
          
    if(dia>=31 && mes>=1){
  
        System.out.println("Dia incorrecto tiene eque ser entre 1 y 30");
        correcte=false;
  
  }
          
    
    if (correcte==true){
  System.out.println("Fecha correcta: "+dia+"/"+mes+"/"+año);
      
  }    
    
   
    
   } 

   
    

}


