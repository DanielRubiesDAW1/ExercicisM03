/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2examenrecursivitat;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio2ExamenRecursivitat {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
          System.out.println("Cuantes files te l'arbre?");
          int files =  sc.nextInt();

          int bombetes = calculaBombetes(files);
          
          System.out.println(files + " files tenen " + bombetes + " bombetes. ");
      
        
    }
    
    
    private static int calculaBombetes(int files) {
    
    
        int bombetes;
        if(files==1)
        {
            bombetes = 1;
            return bombetes;
        }
        else if(files>1)
        {
            bombetes = files;

            return 2+calculaBombetes(files-1);
        }
        
        return -1;
        
    }

}

