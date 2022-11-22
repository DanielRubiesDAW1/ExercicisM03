/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici9;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici8 {

     public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon tu edad ");
        edad = sc.nextInt();

        if (edad>=18){
        //Si es ierta la condicion se ejecutara
        System.out.println("Eres mayor de edad ");
        }
        
        System.out.println("Fin del programa ");

    }
}
