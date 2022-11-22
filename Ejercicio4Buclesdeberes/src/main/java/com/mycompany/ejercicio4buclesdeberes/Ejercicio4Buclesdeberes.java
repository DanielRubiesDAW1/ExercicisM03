/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio4buclesdeberes;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio4Buclesdeberes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
      
        System.out.println("Escribe el numero maximo ");
        
        int numero_max;
        numero_max = sc.nextInt();

        int contador=1;
        System.out.println("while:   ");
        while(contador<=numero_max)
            {
            System.out.println(" "+ contador);
            contador = contador+1;
            }
    
    }
}
