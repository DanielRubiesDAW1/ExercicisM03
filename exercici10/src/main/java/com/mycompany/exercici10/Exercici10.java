/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici10;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici10 {

     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double num1, num2;
      System.out.println("Escribe un numero");
      num1 = sc.nextDouble();
      System.out.println("Escribe un segundo numero");
      num2 = sc.nextDouble();
      
      double suma = num1 + num2;
      double resta = num1 - num2;
      double producto = num1 * num2;
      
      System.out.println("Suma de num1 y num2 " + suma);
      System.out.println("Resta de num1 y num2  " + resta);
      System.out.println("Multiplicacion de num1 y num2  " + producto);
      
      double divi = 0;
      if(num2!=0){
       //si es diferente de 0 se ejcutara este codigo
       //si separamos la division de esta forma solo mostrara la division en el caso que esta se pueda ejecutar
      divi = num1 / num2;
        System.out.println("Division de num1 y num2 " + divi);

        
      }
      
      //si ponemos esto nos pondra un mensaje diciendos que adem
      
      //else{System.out.println("el segundo numero es 0 y no se puede dividir7");
      
      }

    }
