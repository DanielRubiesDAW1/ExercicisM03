/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici15;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici16 {

    public static void main(String[] args) {
        
        int nota;
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una nota");
        nota = sc.nextInt();
        
        if (nota>=0 && nota<=3)
        {
        System.out.println("Muy Deficiente");
        }
        
        else if (nota<=4)
        {
        System.out.println("Insuficiente");
        }
        
        else if (nota<=6)
        {
        System.out.println("Bien");
        }
        
        else if (nota<=8)
        {
        System.out.println("Notable");
        }
         
        else if (nota<=10)
        {
        System.out.println("Sobresaliente");
        }
    }
}
