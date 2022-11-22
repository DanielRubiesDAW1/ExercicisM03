/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemploclassemath;

/**
 *
 * @author daru4279
 */
public class EjemploclasseMath {

    public static void main(String[] args) {

        int n1=5;
        int n2=7;
        
        int maxim = Math.max(n1, n2);
        System.out.println("Maxim es "+maxim);

        double decimales = 345.178;
        System.out.println("Decimales "+decimales);
        long ParteEntera=Math.round(decimales);
        System.out.println(ParteEntera);
        int numAleatorio =(int)Math.random()*10;
        System.out.println("Aleatorio "+ numAleatorio);
        int negativo=Math.negateExact(6);
        System.out.println("El negativo es "+negativo);
        double exponent=Math.pow(5,3);
        System.out.println("5 elevado a 3 es "+exponent);
    }
}
