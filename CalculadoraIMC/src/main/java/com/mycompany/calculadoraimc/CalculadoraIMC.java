/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadoraimc;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class CalculadoraIMC {

       public static void main(String[] args) {
        double altura, peso, IMC;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introducce el peso de la persona: ");
        peso = sc.nextDouble();
   
        System.out.println("Introduce la estatura de la persona: ");
        altura = sc.nextDouble();
        
        if(peso <= 635 || altura <= 2.75 ){
            
            IMC = calculoIndiceIMC(altura, peso);
            
            if(peso <= 635 || altura <= 2.75 ){
                System.out.println("El valor de IMC es: " + IMC);
                 interpretarIndiceIMC (IMC); 

            }
            
            else {    
                System.out.println("Valores incorrectos");
                
            }  
        }
        
            else { 
                    System.out.println("Valores incorrectos");
                }
        
        }
    
    public static double calculoIndiceIMC(double estatura, double pes){
       double calculo;
        calculo= pes /(estatura * estatura);
        return calculo;
    }
    
    public static void interpretarIndiceIMC(double indiceIMC){
    
    if (indiceIMC < 18.5){
           
        System.out.println("Tienes un peso bajo");
    }
    
    else if(indiceIMC == 18.5 || indiceIMC <= 24.99){
            
        System.out.println("Tienes un peso normal");
    }
    
    else if (indiceIMC >= 25){
           
        System.out.println("Tienes Sobrepeso");
        }
    }

}