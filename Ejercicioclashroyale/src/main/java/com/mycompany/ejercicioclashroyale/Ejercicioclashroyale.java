/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicioclashroyale;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicioclashroyale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Escribe el numero de copas que tengas");
        int copas = sc.nextInt();
        
        char carta;
        sc.nextLine();//LIMPIamos BUFFER DEL ESCANNER DEL NEXT INT 
        
        if(copas<2000){
        System.out.println("Elige entre estas cartas");
        System.out.println("M. Mago electrico");
        System.out.println("E. esbirro mega");       
        System.out.println("-------------------");
        System.out.println("Escribe el numero de la carta que quieras");
        
        carta = sc.nextLine().charAt(0);

        switch(carta){
        
            case 'm','M':
                    System.out.println("Has escogido al Mago electrico");
            break;
            
            case 'e','E':
                    System.out.println("Has escogido al esbirro mega");
                    
            break;
            
        }
        }
        
        else if (copas>=2000 && copas <3000){
        
        System.out.println("Elige entre estas 2 nuevas cartas");
        System.out.println("C. caballero");
        System.out.println("B. bandida");       
        System.out.println("-------------------");
        System.out.println("Escribe el numero de la carta que quieras");
       
        carta = sc.nextLine().charAt(0);

           switch(carta){
        
            case 'c', 'C':
                    System.out.println("Has escogido al caballero");
            break;
            
            case 'b','B':
                    System.out.println("Has escogido a la bandida");
                    
            break;
            
        }
           
        }
        
        else if (copas>=3000){
        
        System.out.println("Elige entre estas 2 nuevas cartas");
        System.out.println("K. Esqueleots");
        System.out.println("G. Gigante");       
        System.out.println("-------------------");
        System.out.println("Escribe el numero de la carta que quieras");
       
        carta = sc.nextLine().charAt(0);

           switch(carta){
        
            case 's', 'S':
                    System.out.println("Has escogido el ejercito de esqueletos");
            break;
            
            case 'g','G':
                    System.out.println("Has escogido el gigante");
                    
            break;
            
        }
           
        }
        
        
    }
}
