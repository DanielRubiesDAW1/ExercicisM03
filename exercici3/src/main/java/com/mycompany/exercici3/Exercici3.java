/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici3;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado = 3;
        System.out.println("por la longitud del lado");
        lado = sc.nextDouble(); //Lee de nuestro teclado un entero el cual se lo asigna al lado (es decir hace que pongas tu el numero escribienolo)
        double area = lado*lado;
        System.out.println("El lado mide " + lado);
        System.out.println("El area mide " + area);
    }
}
