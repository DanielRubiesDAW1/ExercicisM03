/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemploconillsrecursivitat;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejemploconillsrecursivitat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("En que mes quieres saber cuantos conejos hay ?");
        int mes=sc.nextInt();
        int conejos=ConejosFib(mes);
        
                System.out.println("En el "+mes+" temdras "+conejos+" parejas de conejo/s");

    }

 public  static int ConejosFib(int mes){
            
      int resultado;
      
            if(mes<=1){
                
                return 1;
                
            }
            
            else if(mes>1){
                
            resultado=ConejosFib(mes-1) + ConejosFib(mes-2);
                    
                    return resultado;

            }
            
        return 0;
  
 }

}

