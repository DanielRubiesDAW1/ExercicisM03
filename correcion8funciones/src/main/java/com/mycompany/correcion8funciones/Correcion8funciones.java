/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.correcion8funciones;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Correcion8funciones {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
            System.out.println("Pon un numero;");
            
            int numero=sc.nextInt();
            int suma,producto;
            double mitad,mitad2numeros;
            
            suma=suma1aN(numero);
            System.out.println("La suma de 1 a "+numero+" es "+suma);
            
            producto= producto1aN(numero);
            System.out.println("El producto de 1 a "+numero+" es "+producto);
            
            mitad=intermedio1aN(numero);
            System.out.println("La mitad de 1 a "+numero+" es "+mitad);

            mitad2numeros=intermedioNyM(numero,1000);
            System.out.println("La mitad de "+numero+" y 1000 es " +mitad2numeros);

    }
    
    
    public static int suma1aN(int n){
    
            int suma=0;
        
        for (int i = 1; i <=9; i++) {
            
            suma=suma+i;  //acumulativo sencillo
            
        }
        return suma;
    
    }
    
    public static int producto1aN(int n){
        
        int producto=1;
        
        for (int i = 1; i <=n; i++) {
            
            producto=producto*1;
            
        }
        return producto;
   
   }
  
    public static double intermedio1aN(int n){
  
        double mitad =(double)(1+n)/2;
        
        return mitad;
        
  }
      
    public static double intermedioNyM(int minimo, int maximo){
  
        double mitad2numeros =(double)(maximo+minimo)/2;
        
        return mitad2numeros;
        
  }
}
