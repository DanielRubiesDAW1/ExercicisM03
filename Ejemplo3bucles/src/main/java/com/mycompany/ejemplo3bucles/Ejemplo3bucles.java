/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo3bucles;

/**
 *
 * @author daru4279
 */
public class Ejemplo3bucles {

    public static void main(String[] args) {

        int suma_acum=0;
        int contador=1;
        
        while(contador<=5){
        
        suma_acum = suma_acum + contador;
        System.out.println("Contador " +contador+" suma " +suma_acum);

        contador = contador+1;
        }
        
        System.out.println("La suma acumulada while es "+suma_acum);

       for (contador=1; contador<=5; contador++)
    
            System.out.println("La suma acumulada for es "+ suma_acum);
       
       
       //PREGUNTAR PORQUE SALE VARIAS VECES
    }
}

