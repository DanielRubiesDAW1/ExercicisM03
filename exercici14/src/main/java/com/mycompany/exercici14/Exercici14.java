/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici14;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici14 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int num1, num2;
      System.out.println("Escribe un numero");
      num1 = sc.nextInt();
      System.out.println("Escribe un segundo numero");
      num2 = sc.nextInt();
     
    if(num1>=num2)
        {
           //si es cierto que num
          System.out.println("");
               if (num1==num2)
               {
                      System.out.println("Los numeros son iguales ");
               }
               else //(num1==num2)
              {
                      System.out.println("El mayor es "+num1);

              }
        }
 
    
    else //(num1>=num2)
        {
                  System.out.println("El mas grande seria "+num2);
        }
 
     
     



    }
}
