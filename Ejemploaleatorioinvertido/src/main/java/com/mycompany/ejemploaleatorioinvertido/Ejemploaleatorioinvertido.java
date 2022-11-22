/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemploaleatorioinvertido;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejemploaleatorioinvertido {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in); 

        
        int aleatorio;
        int numero;
        aleatorio = rd.nextInt(10)+1; //  EL QUE TIENE EL + ES EL NUMERO MINIMO Y EL DEL BOUND ES 10 MAS A PARTIR DEL MINIMO |||| Nunca poner dentro del bucle (do) porque cambiaria a un numero aleatorio todo el rato
        
        
        do{
            System.out.println("Escribe un numero");
            numero =sc.nextInt();




            if (numero>aleatorio)
                {

                    System.out.println("El numero es mas pequeño");

                }

            else if(numero<aleatorio)
                {

                    System.out.println("El numero es mas grande");

                }
        }while(numero!=aleatorio);
        
                    System.out.println("Correcto");

        }

    }

