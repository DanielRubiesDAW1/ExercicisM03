/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici3examenm03;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici3examenm03 {

    public static void main(String[] args) {
        
        
              Scanner sc = new Scanner(System.in); 

            int numero_personas,numero_menores;
            int entrada_adult=20;
            int entrada_infantil=10;
            int entrada_gratuita=0;
            double calculo=0;
            double descuento=0.25;
            System.out.println("Escribe el numero de personas");
            numero_personas =sc.nextInt();
            System.out.println("Escribe el numero de menores");
            numero_menores =sc.nextInt();
            
            if(numero_personas<=9 && numero_personas>=1){
            
            numero_personas=numero_personas-numero_menores;
            entrada_adult=numero_personas*entrada_adult;
            entrada_infantil=numero_menores*entrada_infantil;
            calculo=entrada_infantil+entrada_adult;
              
                System.out.println("No tens descompte");
            }
            
            
            if(numero_personas>=10 && numero_personas<=24){
            
            numero_personas=numero_personas-numero_menores;
            entrada_adult=numero_personas*entrada_adult;
            entrada_infantil=numero_menores*entrada_infantil;
            calculo=entrada_infantil+entrada_adult-descuento;
            
            System.out.println("Tienes descuento del 25%");

            
            }
            
            if(numero_personas>=25){
            
            numero_personas=numero_personas-numero_menores;
            entrada_adult=numero_personas*entrada_adult;
            entrada_infantil=numero_menores*entrada_infantil;
            entrada_gratuita=numero_personas-1;

            calculo=entrada_infantil+entrada_adult-entrada_gratuita-descuento;
            
            System.out.println("Tienes descuento del 25% y una entrada gratuita de adulto");

  
            }
          System.out.println("El precio total seria:"+calculo);

    }
}
