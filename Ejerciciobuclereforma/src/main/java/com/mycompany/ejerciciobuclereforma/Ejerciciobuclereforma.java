/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciobuclereforma;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejerciciobuclereforma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int anchura;
        int longitud;
        char seguir;
        int areacasa=0;
        int areah;

        do{
            System.out.println("Altura habitacion: ");
            anchura=sc.nextInt();

            System.out.println("Longitud habitacion: ");
            longitud=sc.nextInt();

        areah=anchura*longitud;
        areacasa = areacasa+areah;
             
        System.out.println("Tu casa tiene mas habitaciones?(s/n)");
        seguir = sc.next().charAt(0);

        
        

        }while(seguir=='s' || seguir=='S');
        System.out.println("Este es el area total de tu casa es "+areacasa);
    }
}
