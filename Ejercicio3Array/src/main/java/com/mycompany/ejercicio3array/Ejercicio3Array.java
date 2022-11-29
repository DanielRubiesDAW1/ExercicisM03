/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3array;

import java.util.Scanner;

/**
 *Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
* *
 * @author daru4279
 */
public class Ejercicio3Array {

    public static void main(String[] args) {
       
        final int TAMANY=8;
        int[] nums = new int[TAMANY];
 
        intrducircDatosArray(nums);
        
        mostrarArray(nums);
        
        int minimo, maximo;
        minimo=nums[0]; // si solo lee un numero siempre sera el minimo.
        maximo=nums[0]; // si solo lee un numero siempre sera el maximo.
        
        for (int index = 0; index < nums.length; index++) {
            
            if(nums[index]>maximo){
        
                maximo=nums[index];
                
            }
            
            if(nums[index]<minimo){
            
                minimo=nums[index];
                
            }
            System.out.println("El minimo es "+minimo);
            System.out.println("El minimo es "+maximo);

        }
        
    }    
    
      public static void intrducircDatosArray(int[] nums) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Introduce valor "+(i+1)+"-");
            nums[i]=sc.nextInt();
    }
  }
  
    public static void mostrarArray(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Posicio " + i + " conte -> " + nums[i]);
            
        }
    }
    
}
  
        




