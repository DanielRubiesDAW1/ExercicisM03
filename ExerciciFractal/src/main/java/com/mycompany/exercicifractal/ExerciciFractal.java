/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicifractal;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class ExerciciFractal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el lado del cuadrado inicial:");
        int lado= sc.nextInt();

        int perimetro_total=contarPerimetroFractal(lado);
        
        System.out.println("Perimetro total: "+perimetro_total);
    }

    private static int contarPerimetroFractal(int lado) {
        
        if(lado==0){
        
            return 0;
        }
        
        else if(lado==1){
        
        return 4*lado;
        
        }
        
        else if(lado>1){
        return 4*lado+contarPerimetroFractal(lado/2);
            
        }
        
        
        return -1;
    }
  public static void morarArray(int [] valores){
    
        for (int i = 0; i < valores.length; i++) {
            
            System.out.println("Posocion "+i+ " conte --> "+valores[i]);

        }
    
    }
//ejercicio GIT DANI

    
    }
    
    
    

