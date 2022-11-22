/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicii15;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercicii15 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num1, num2, num3;
       System.out.println("Escribe un numero");
       num1 = sc.nextInt();
       System.out.println("Escribe un segundo numero");
       num2 = sc.nextInt();      
       System.out.println("Escribe un tercer numero");
       num3 = sc.nextInt();
       
       if (num1>=num2 && num1>=num3){
       System.out.println("El numero mas grande es "+num1);

       }
       
       else if (num2>=num1 && num2>=num3){
       System.out.println("El numero mas grande es "+num2);

       }
       
       else if(num3>num1 && num3>num2)
       {
       System.out.println("El numero mas grande es "+num3);
       }
       
     
    
       }
 }

