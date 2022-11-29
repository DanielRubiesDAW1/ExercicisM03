/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio1examenrecursivitat;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio1ExamenRecursivitat {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Cual es tu ID de usuari?");     
        int ID =  sc.nextInt();
    
        llegirNumero(ID);
        System.out.println("Tu id es: "+ID);
        
        
//
     System.out.println("Cual es tu año de nacimiento?");     
       int AñoNacimiento = sc.nextInt();
//        
     generarContrasenya(AñoNacimiento,ID);
     System.out.println("Tu año de nacimiento es: "+AñoNacimiento);
        
        mostrarPerfilUsuari(ID,AñoNacimiento);
        
    }
    
    
    
    
    private static int llegirNumero(int ID_Usuari ) {
    
       //En este metodo lo que se esta haciendo es preguntar la ID del usuario la cual 
       //tiene que ser mayor 1000 y mas pequeña que 10000 y en el caso de que fuera igual a 1000 o menor o 10000 o mas preguntara hasta que le pongas un numero correcto.
    
        if(ID_Usuari<10000 & ID_Usuari>1000){
        
            return ID_Usuari;
        }

        return -1;
    }
    
    
    
    
   private static int generarContrasenya(int Año, int ID_Usuari){

       //En este metodo he calculado el resultado multiplicando el resultado de el ID_Usuari con el año de nacimiento
       // despues en la variable contraseña que he creado he dividido el resultado entre 10000 y le he hecho el return.
       // SIN BUCLE
       
       int resultado;
        resultado = llegirNumero(ID_Usuari*Año);
      
        return resultado/10000;
       
   
   }
   
     private static void mostrarPerfilUsuari(int ID_Usuari, int Año ){
     
         //Esta mal feta la edad pero nmostr la ID que hem posat en el primer metoede y la edad (la contraseña no esta be)
        int Edad;
        Edad=18;
        
         System.out.println("*************************");
         System.out.println(+ID_Usuari+" - "+Edad+ " - "+"Contraseña" );
         System.out.println("*************************");
         
              
     }
}



