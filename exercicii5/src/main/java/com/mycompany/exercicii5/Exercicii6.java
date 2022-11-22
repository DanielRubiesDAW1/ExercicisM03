/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicii5;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercicii6 {

    public static void main(String[] args) {
        
        final double Pi = 3.14;
        double radio;
        double area;
        double longitud;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un valor");
        radio = sc .nextDouble();
        double diametro = radio + radio;
        longitud = Pi * diametro;
        System.out.println("la longitud es "+ longitud);
        area = Pi * radio * radio;
        System.out.println("el area es "+ area);

    }
}
