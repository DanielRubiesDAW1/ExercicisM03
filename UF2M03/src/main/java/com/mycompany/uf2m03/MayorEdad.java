/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uf2m03;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class MayorEdad {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        boolean mayor;

        
         //pedir edad usuario 
        int edad;
        System.out.println("Introduce tu edad");
        edad=sc.nextInt();
        

        mayor=esMayorEdad(edad);


        //lamar a la funcion que te vuelve: True or False. Si eres mayor de edad o no.
         
         //Y dependiendo de lo que salga escribir si eres mayor de edad o no

            if(mayor==true){
     
                     System.out.println("Eres mayor de edad");

                 }
            
            else{
                System.out.println("Eres menor de edad");
            }
                    
     }
     
      public static boolean esMayorEdad(int a){
      
          //otra forma es lo que este comentado con este simbolo "*":
          
          boolean mayor;
          
          if(a>=18){
          
              //*return true;
               mayor=true;
          }
          
          else{
              
                //*return false;
                 mayor=false;
          }
          
           return mayor;
      }
     
}

