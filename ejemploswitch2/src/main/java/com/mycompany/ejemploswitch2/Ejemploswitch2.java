/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemploswitch2;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejemploswitch2 {

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

        char opcion = sc.nextLine().charAt(0); //char es opcion caracter
        
        switch (opcion){
                
            case 'a':
            case 'A': 
                System.out.println("A jugar");

                    break;
        
        
            case 'b': 
                System.out.println("Modo entrenamiento");

                 break;
        
            case 'c': 
                System.out.println("Tu coleccion ");

                     break;
        
            case 'd': 
                System.out.println("Tu perfil");

                    break;
            
            case 'z': 
                System.out.println("Salir");

                     break;
                
            default:
                          
                System.out.println("Opcion no valida");

        }
    }
  }
}
        


    


