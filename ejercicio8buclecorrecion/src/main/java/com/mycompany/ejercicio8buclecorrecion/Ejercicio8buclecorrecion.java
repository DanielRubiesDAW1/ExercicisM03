/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio8buclecorrecion;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio8buclecorrecion {


    public static void main(String[] args) {
    
       int numeros;
       
        Scanner sc = new Scanner(System.in); 
        
        int count_positivo = 0;
        int count_negativo = 0;
        
        do{
        System.out.println("Pon numeros para terminar escribe un 0");
        numeros=sc.nextInt();
                
                if (numeros > 0){
                
                    ++count_positivo;
                   
                }
                
                else if(numeros<0){
                    
                    count_negativo++;
                }
        
        }
        
        while(numeros!=0);
        
        {
            
                    System.out.println("Fin del programa");

                }
                
        }
        }
        
        
        
        
    
