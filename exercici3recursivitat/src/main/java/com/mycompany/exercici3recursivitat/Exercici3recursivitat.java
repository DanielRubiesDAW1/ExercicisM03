/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici3recursivitat;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici3recursivitat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero de entrada: ");
        int n=sc.nextInt();
        int sortida=sumarecursivaparells(n);
        
                System.out.println("Sortida: "+sortida);    }

    private static int sumarecursivaparells(int n) {
            
        int resultadocalculo;
      
            if(n==2){ //caso base
                
                return 2;
                
            }
            
            else if(n%2==1){ //caso no admintido
            
            return -1;            
            }
            
            else{ //recursivo
            
            return n+sumarecursivaparells(n-2);
            }
        
        
    }
}
