/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.solucionkenny;

import java.util.Scanner;

/**
 *
 * @author kefl0483
 */
public class ExEj3IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso;
        double est;
        do {
            System.out.println("Introduce tu peso: ");
            peso = sc.nextDouble();

        } while (peso > 635 || peso <= 0);

        do {
            System.out.println("Introduce tu estatura: ");
            est = sc.nextDouble();
        } while (est > 2.75 || est <= 0);

        double imctotal = calculoIndiceIMC(est, peso);
        System.out.println("IMC: " + imctotal);

        System.out.print("Tu clasificacioon es: ");
        interpretarIndiceIMC(imctotal);

    }

    public static double calculoIndiceIMC(double estatura, double pes) {

        double imc = pes / (estatura * estatura);
        return imc;
7
    }

    public static void interpretarIndiceIMC(double indiceIMC) {
        if (indiceIMC < 18.50) {
            System.out.println("tienes un bajo peso.");
        } else if (indiceIMC > 18.50 && indiceIMC < 24.99) {
            System.out.println("tienes un peso normal.");
        } else if (indiceIMC > 25) {
            System.out.println("tienes sobrepeso.");
        }
    }

}
