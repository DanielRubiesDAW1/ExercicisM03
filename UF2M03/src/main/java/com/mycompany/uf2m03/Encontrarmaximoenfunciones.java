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
public class Encontrarmaximoenfunciones {

    /*
    
    */
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in); 

            System.out.println("Maximo");
            //pedir dos variables
            
            double max;//tenemos que poner la variable max de abajo aqui para tenerla inicializada

            double num_1;
            System.out.println("Pon el primero numero");

            num_1 = sc.nextDouble();
            
            
            double num_2;
            System.out.println("Pon el segundo numero");

            num_2 = sc.nextDouble();

            //llamar a funcion maximo que retendra el valor  es decir hemos pasado el valor de valor1 y valor2 a num_1 y num_2
            max=maximo(num_1, num_2);
            
            // regerrlo es otra variable
            System.out.println("Maximo --> "+max);
            
            double min;
        
            min=minimo(num_1, num_2);
            
            System.out.println("Minimo --> "+min);

     }
    
    public static double maximo(double valor1, double valor2) {
        double max;
        if (valor1 > valor2)
        max = valor1;
        else
        max = valor2;
        return max;

      }
    
    public static double minimo(double valor1, double valor2) {
        double min;
        if (valor1 > valor2)
        min = valor2;
        else
        min = valor1;
        return min;

      }
            
    
}

