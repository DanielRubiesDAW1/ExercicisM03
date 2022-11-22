/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici4;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici4 {

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
      double divi = num1 / num2;
      
      System.out.println("Suma de num1 y num2 " + suma);
      System.out.println("Resta de num1 y num2  " + resta);
      System.out.println("Multiplicacion de num1 y num2  " + producto);
      System.out.println("Division de num1 y num2 " + divi);
    }
}

