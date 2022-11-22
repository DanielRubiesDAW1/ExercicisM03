/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplosstrings;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class EjemplosStrings {

    public static void main(String[] args) {
        int x=3;
        String frase ="Hola que tal? ";
        System.out.println(frase+x);
        Scanner sc = new Scanner(System.in); 
        
        
    
        
 
        frase=sc.nextLine();
        System.out.println("Frase con nextLine "+ frase);
        
        if(frase.isEmpty()){
            
        System.out.println("String vacio");
        }
        
        else{
        
        System.out.println("String NO vacio");
        }
        
        char letra = frase.charAt(3);
        
        System.out.println("La letra en la posicion 3 es "+ letra);
        System.out.println("La frase tiene "+ frase.length());
        
        for (int i = 0; i < frase.length(); i++) {
            System.out.println("En la posicion " +i+ "hay el caracter" +frase.charAt(1));

        }
        
        String f1="Hola que tal";
        String f2="Hola que tal.";
        
        if (f1.equals(f2)){
            System.out.println("Frase igual");
        }
        
        else{
        
            System.out.println("Frase diferente");
        }
        
               if (f1.equalsIgnoreCase(f2)){
            System.out.println("Frase igual sin importar mayusculas");
        }
        
        else{
        
            System.out.println("Frase diferente sin importar mayusculas");
        }
     
               //ejemplos 2 STRINGS
               
               
               int unicode = f1.codePointAt(0);
               System.out.println("codi unicode "+unicode);
                 
               
               ///Ejercicio 3
               System.out.println("Frsae"+f1.length());
    }
}
//    do{
//        System.out.println("Escribe una frase");
//        }while(frase!=null);
//       frase=sc.next();
       // System.out.println("Frase con next "+ frase);