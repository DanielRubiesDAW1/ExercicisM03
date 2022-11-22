/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemploparesentredosnumero;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejemploparesentredosnumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int num1;
        int num2;
        int min,max;
        
        System.out.println("Escribe el valor minimo:");
            min=sc.nextInt();
                System.out.println("Escribe el valor minimo:");
            max=sc.nextInt();
            
        for(int cont=min;cont<=max;cont++){

            if(cont%2==0){
                
                            System.out.print(cont+" ");

            }
        
        }
    }
}
