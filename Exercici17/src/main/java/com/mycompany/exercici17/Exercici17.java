/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici17;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici17 {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    int horas, minutos, segundos;
    System.out.println("Escribe una hora ");
    horas = sc.nextInt();
    System.out.println("Escribe los minutos ");
    minutos = sc.nextInt();
    System.out.println("Escribe los segundos ");
    segundos = sc.nextInt();
    
    segundos = segundos + 1;
    
    if(segundos == 60){
    
       segundos = 0;
               
       minutos = minutos +1; 
               
        if(minutos == 60){

            horas = horas + 1;
            minutos = 0;
        }
      
            if(horas == 24){

                horas = 0;
            }
    }
    
    
        //mostrar mensaje final
        System.out.println("La hora seria " + horas + ":" + minutos + ":" + segundos);

    
    }
}
