/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio10funcions;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio10funcions {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int dia, mes, año;
    
    System.out.println("Escribe un dia ");
    dia = sc.nextInt();
    
    System.out.println("Escribe el mes ");
    mes = sc.nextInt();
    
    System.out.println("Escribe el mes ");
    año = sc.nextInt(); 
    
    boolean correcte=fechaCorrecta(dia,mes,año);
        
    if(correcte==true){
    
        System.out.println("Fecha correcta");
        
    }
    
    else{
    
        System.out.println("Fecha incorrecta");

    }
    
    }
    
         public static boolean fechaCorrecta(int vdia,int vmes ,int vaño) {
             
             boolean correcte=true;
             
            if(vaño<=1900){
             
            
             }
             
            else if(vmes>=13 || vmes<=0){
                
                 correcte= false;
            }
            
            else if(vdia>=31 || vdia<=0){
                
                 correcte= false;
               
            }

     
         return correcte;
                 
    }
         
}
         

   //boolean correcte=true;