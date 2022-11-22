/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.solucionkenny;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kefl0483
 */
public class ExEj1Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int saldo = 10;

        saldo = Quantitat_apostada(saldo);

        int apuesta = Quantitat_apostada(saldo);
        System.out.println("Cantidad apostada: " + apuesta);

        char ch1 = 0;
        ch1 = (char) tirada_disc(ch1);

        char ch2 = 0;
        ch2 = (char) tirada_disc(ch2);

        char ch3 = 0;
        ch3 = (char) tirada_disc(ch3);

        mostrar_tirada(ch1, ch2, ch3);
        
        int premio = Calcular_premi( ch1, ch2, ch3, apuesta);
        System.out.println("Premio: "+ premio);

    }

    public static int Quantitat_apostada(int saldo) {

        Scanner sc = new Scanner(System.in);
        int dinapostado;

        do {

            System.out.print("Cuanto dinero quieres apostar? ");

            dinapostado = sc.nextInt();

        } while (dinapostado < 0 || dinapostado > saldo);
        if (dinapostado > 0 && dinapostado <= saldo) {
            return dinapostado;

        } else {
            return dinapostado;
        }

    }

    public static int tirada_disc(char letra) {
        Random rd = new Random();
        int aleatorio = rd.nextInt(3) + 1;
        if (aleatorio == 1) {
            letra = 'A';
        }
        if (aleatorio == 2) {
            letra = 'B';
        }
        if (aleatorio == 3) {
            letra = 'C';
        }

        return letra;
    }

    public static void mostrar_tirada(char c1, char c2, char c3) {
        System.out.println(c1 + " - " + c2 + " - " + c3);

    }
    public static int Calcular_premi(char c1, char c2, char c3, int apuesta){
        int dinero = 0;
        System.out.println("caracter" + c1 + c2 + c3);
        if (c1 == 'A' && c2 == 'A' && c3 == 'A'){
            dinero = apuesta + 5;
            
            
            
        }if (c1 == 'B' && c2 == 'B' && c3 == 'B'){
            dinero = apuesta + 2;
            
            
            
        }if (c1 == 'C' && c2 == 'C' && c3 == 'C'){
            dinero = apuesta * 2;
            
            
            
        } else {
            dinero = 0;
        }
        return dinero;
    
    }
        

}
