/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemploswitch;

import java.util.Scanner;

/**
 *1
 * @author daru4279
 */
public class Ejemploswitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("******Bienvenido********");
        System.out.println("1. Jugar");
        System.out.println("2. Entrenamiento");
        System.out.println("3. Galeria de heroes");
        System.out.println("4. Perfil Personal");
        System.out.println("0. Salir del juego");
        System.out.println("************************");
        System.out.println("Elige una opcion");

        int opcion = sc.nextInt();
        
        switch (opcion){
                
             case 1: 
                System.out.println("A jugar");

             break;
        
        
          case 2: 
                System.out.println("Modo entrenamiento");

            break;
               case 3: 
                System.out.println("Tu coleccion ");

            break;
               case 4: 
                System.out.println("Tu perfil");

            break;
        
            case 100: 
                System.out.println("Salir");

            break;
        
                default:
                          
                System.out.println("Opcion no valida");

        }


    }
}
